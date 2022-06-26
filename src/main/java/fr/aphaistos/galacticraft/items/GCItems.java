package fr.aphaistos.galacticraft.items;

import fr.aphaistos.galacticraft.GalacticraftMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GCItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GalacticraftMod.MOD_ID);
	
	
	
	public static final RegistryObject<Item> OXYGEN_TANK_LIGHT = ITEMS.register("oxygen_tank_light_full", () -> new ItemOxygenTank(1, new Item.Properties()));
	public static final RegistryObject<Item> OXYGEN_TANK_MEDIUM = ITEMS.register("oxygen_tank_med_full", () -> new ItemOxygenTank(2, new Item.Properties()));
	public static final RegistryObject<Item> OXYGEN_TANK_HEAVY = ITEMS.register("oxygen_tank_heavy_full", () -> new ItemOxygenTank(3, new Item.Properties()));
	public static final RegistryObject<Item> OXYGEN_MASK = ITEMS.register("oxygen_mask", () -> new ItemOxygenMask(new Item.Properties()));
	// TODO: Rocket Item Tier 1
	public static final RegistryObject<Item> SENSOR_GLASSES = ITEMS.register("sensor_glasses", () -> new ItemSensorGlasses(new Item.Properties()));
	public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new ItemPickaxeGC(new Item.Properties()));	
	public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new ItemAxeGC(new Item.Properties()));	
	public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new ItemHoeGC(new Item.Properties()));	
	public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ItemSpadeGC(new Item.Properties()));	
	public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new ItemSwordGC(new Item.Properties()));
	public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ItemArmorGC(EquipmentSlot.HEAD, new Item.Properties()));
	public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ItemArmorGC(EquipmentSlot.CHEST, new Item.Properties()));
	public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ItemArmorGC(EquipmentSlot.LEGS, new Item.Properties()));
	public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ItemArmorGC(EquipmentSlot.FEET, new Item.Properties()));

	public static final RegistryObject<Item> STEEL_POLE = ITEMS.register("steel_pole", () -> new ItemBase(new Item.Properties()));
}