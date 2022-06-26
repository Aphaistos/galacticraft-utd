package fr.aphaistos.galacticraft.items;

import java.util.List;

import fr.aphaistos.galacticraft.GalacticraftMod;
import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemBase extends Item implements ISortableItem {
	
    float smeltingXP = -1F;
	
	public ItemBase(Properties props) {
		super(props.tab(GalacticraftMod.GALACTICRAFT_ITEMS_TAB));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public Rarity getRarity(ItemStack stack) {
		return GalacticraftMod.GALACTICRAFT_ITEM;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		/*if (stack != null && this == GCItems.heavyPlatingTier1) {
			tooltip.add(GCCoreUtil.translate("item.tier1.desc"));
		} else if (stack != null && this == GCItems.dungeonFinder) {
			tooltip.add(EnumColor.RED + GCCoreUtil.translate("gui.creative_only.desc"));
		}*/
	}

	@Override
	public EnumSortCategoryItem getCategory(int meta) {
		return EnumSortCategoryItem.GENERAL;
	}
	
	public void setSmeltingXP(float smeltingXP) {
		this.smeltingXP = smeltingXP;
	}
	
}