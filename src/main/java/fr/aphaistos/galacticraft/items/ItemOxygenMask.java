package fr.aphaistos.galacticraft.items;

import fr.aphaistos.galacticraft.GalacticraftMod;
import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemOxygenMask extends Item implements ISortableItem, IClickableItem {

	public ItemOxygenMask(Properties props) {
		super(props.tab(GalacticraftMod.GALACTICRAFT_ITEMS_TAB));
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public Rarity getRarity(ItemStack stack) {
		return GalacticraftMod.GALACTICRAFT_ITEM;
	}
	
	@Override
	public EnumSortCategoryItem getCategory(int meta) {
		return EnumSortCategoryItem.GEAR;
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (player instanceof RemotePlayer) {
            if (itemStack.getItem() instanceof IClickableItem) {
                itemStack = ((IClickableItem)itemStack.getItem()).onItemRightClick(itemStack, level, player);
            }

            if (itemStack.isEmpty()) {
                return new InteractionResultHolder<>(InteractionResult.SUCCESS, itemStack);
            }
        }
		return new InteractionResultHolder<>(InteractionResult.PASS, itemStack);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, Level level, Player player) {
		// TODO: Handle fast equip
        return itemStack;
	}
}