package fr.aphaistos.galacticraft.items;

import fr.aphaistos.galacticraft.GalacticraftMod;
import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemArmorGC extends ArmorItem implements ISortableItem {

	public ItemArmorGC(EquipmentSlot slot, Properties props) {
		super(GCArmorMaterials.STEEL, slot, props.tab(GalacticraftMod.GALACTICRAFT_ITEMS_TAB));
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public Rarity getRarity(ItemStack stack) {
		return GalacticraftMod.GALACTICRAFT_ITEM;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
		if(this.material == GCArmorMaterials.STEEL) {
			if(stack.getItem() == GCItems.STEEL_HELMET.get())
				return GalacticraftMod.MOD_ID + ":textures/models/armor/steel_1.png";
			if(stack.getItem() == GCItems.STEEL_CHESTPLATE.get() || stack.getItem() == GCItems.STEEL_BOOTS.get())
				return GalacticraftMod.MOD_ID + ":textures/models/armor/steel_2.png";
			if(stack.getItem() == GCItems.STEEL_LEGGINGS.get())
				return GalacticraftMod.MOD_ID + ":textures/models/armor/steel_3.png";
		}
		return null;
	}

	@Override
	public EnumSortCategoryItem getCategory(int meta) {
		return EnumSortCategoryItem.ARMOR;
	}
	
	/*@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair_) {
		return  repair.getItem() == GCItems.BASIC_ITEM.get() && repair.getItemDamage() == 9;
	}*/

}