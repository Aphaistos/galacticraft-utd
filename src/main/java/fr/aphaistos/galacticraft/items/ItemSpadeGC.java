package fr.aphaistos.galacticraft.items;

import fr.aphaistos.galacticraft.GalacticraftMod;
import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemSpadeGC extends ShovelItem implements ISortableItem {

	public ItemSpadeGC(Properties props) {
		super(GCToolTiers.STEEL, 1.5F, -3.0F, props.tab(GalacticraftMod.GALACTICRAFT_ITEMS_TAB));
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