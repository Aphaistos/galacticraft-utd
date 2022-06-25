package fr.aphaistos.galacticraft;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GalacticraftMod.MOD_ID)
public class GalacticraftMod {
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public static final String MOD_ID = "galacticraft";
    
    public GalacticraftMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	LOGGER.info("Setup !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}