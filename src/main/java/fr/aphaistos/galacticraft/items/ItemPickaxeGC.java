package fr.aphaistos.galacticraft.items;

import fr.aphaistos.galacticraft.GalacticraftMod;
import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemPickaxeGC extends PickaxeItem implements ISortableItem {

	public ItemPickaxeGC(Properties props) {
		super(GCToolTiers.STEEL, 1, -2.8F, props.tab(GalacticraftMod.GALACTICRAFT_ITEMS_TAB));
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public Rarity getRarity(ItemStack stack) {
		return GalacticraftMod.GALACTICRAFT_ITEM;
	}

	@Override
	public EnumSortCategoryItem getCategory(int meta) {
		return EnumSortCategoryItem.TOOLS;
	}
	
}