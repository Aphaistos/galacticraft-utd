package fr.aphaistos.galacticraft.items;

import fr.aphaistos.galacticraft.GalacticraftMod;
import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class ItemSensorGlasses extends ArmorItem implements ISortableItem, ISensorGlassesArmor {

	public ItemSensorGlasses(Properties props) {
		super(GCArmorMaterials.SENSOR_GLASSES, EquipmentSlot.HEAD, props.tab(GalacticraftMod.GALACTICRAFT_ITEMS_TAB));
	}
	
	@Override
	public boolean isEnchantable(ItemStack p_41456_) {
		return false;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
		return GalacticraftMod.MOD_ID + ":textures/models/armor/sensor_1.png";
	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		return GalacticraftMod.GALACTICRAFT_ITEM;
	}
	
	// TODO: render overlay

	@Override
	public EnumSortCategoryItem getCategory(int meta) {
		return EnumSortCategoryItem.GEAR;
	}

}