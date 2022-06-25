package fr.aphaistos.galacticraft.items;

import java.util.List;

import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ItemOxygenTank extends Item implements ISortableItem, IClickableItem {

	public ItemOxygenTank(int tier, Properties props) {
		super(props);
		props.stacksTo(1);
		props.durability(tier * 900);
		props.setNoRepair();
	}

	
	@Override
	public boolean isEnchantable(ItemStack stack) {
		return false;
	}
	
	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(new TextComponent(new TranslatableComponent("gui.tank.oxygen_remaining") + ": "  + (stack.getMaxDamage() - stack.getDamageValue())));
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
        /*GCPlayerStats stats = GCPlayerStats.get(player);
        ItemStack gear = stats.getExtendedInventory().getStackInSlot(2);
        ItemStack gear1 = stats.getExtendedInventory().getStackInSlot(3);

        if (gear.isEmpty()) {
            stats.getExtendedInventory().setInventorySlotContents(2, itemStack.copy());
            itemStack = ItemStack.EMPTY;
        }
        else if (gear1.isEmpty()) {
            stats.getExtendedInventory().setInventorySlotContents(3, itemStack.copy());
            itemStack = ItemStack.EMPTY;
        }
        */
        return itemStack;
    }
}