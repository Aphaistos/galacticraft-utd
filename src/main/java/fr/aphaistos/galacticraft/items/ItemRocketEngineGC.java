package fr.aphaistos.galacticraft.items;

import fr.aphaistos.galacticraft.GalacticraftMod;
import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemRocketEngineGC extends Item implements ISortableItem {

	public ItemRocketEngineGC(Properties props) {
		super(props.tab(GalacticraftMod.GALACTICRAFT_ITEMS_TAB).durability(0));
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public Rarity getRarity(ItemStack stack) {
		return GalacticraftMod.GALACTICRAFT_ITEM;
	}

	@Override
	public EnumSortCategoryItem getCategory(int meta) {
		return EnumSortCategoryItem.GENERAL;
	}

}