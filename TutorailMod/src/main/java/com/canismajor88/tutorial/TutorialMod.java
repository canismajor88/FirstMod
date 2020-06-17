package com.canismajor88.tutorial;


import com.canismajor88.tutorial.util.RegistryHandler;
import com.canismajor88.tutorial.world.gen.TutorialGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod("tutorial")
public class TutorialMod
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID="tutorial";
    public TutorialMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        TutorialGeneration.generate();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

}
