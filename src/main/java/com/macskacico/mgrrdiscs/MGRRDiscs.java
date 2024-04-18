package com.macskacico.mgrrdiscs;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

@Mod(modid = MGRRDiscs.MODID, version = com.macskacico.mgrrdiscs.MGRRDiscs.VERSION)
public class MGRRDiscs
{
    public static final String MODID = "MGRRDiscs";
    public static final String VERSION = "1.1";
    public static boolean prettyTextures = true;
    public static boolean discDrop = true;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        ModItems.init();
        if(discDrop) MinecraftForge.EVENT_BUS.register(new MobDropsHandler());

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        try {
            config.load();

            Property prettyTexturesProp = config.get(Configuration.CATEGORY_GENERAL,"256*256 textures", true, "Set false, if the 256*256 music discs are lagging you.");
            Property discDropProp = config.get(Configuration.CATEGORY_GENERAL,"Disc Drop", true,"Set false, if you don't want discs to drop");
                    prettyTextures = prettyTexturesProp.getBoolean();
                    discDrop = discDropProp.getBoolean();

        } catch (Exception e) {
        } finally {
            if (config.hasChanged()) config.save();


        }
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
