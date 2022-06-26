package fr.aphaistos.galacticraft;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import fr.aphaistos.galacticraft.items.GCItems;
import fr.aphaistos.galacticraft.util.CreativeTabGC;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GalacticraftMod.MOD_ID)
public class GalacticraftMod {
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public static final String MOD_ID = "galacticraft";

	public static final CreativeTabGC GALACTICRAFT_BLOCKS_TAB = new CreativeTabGC(CreativeModeTab.getGroupCountSafe(), "galacticraft_blocks", new ItemStack(Items.GUNPOWDER), null);
	public static final CreativeTabGC GALACTICRAFT_ITEMS_TAB = new CreativeTabGC(CreativeModeTab.getGroupCountSafe(), "galacticraft_items", new ItemStack(Items.GUNPOWDER), null);;
    
    public static final Rarity GALACTICRAFT_ITEM = Rarity.create("Space", ChatFormatting.BLUE);
	
    public GalacticraftMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        
        GCItems.ITEMS.register(eventBus);
        
        // MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	LOGGER.info("Setup !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}