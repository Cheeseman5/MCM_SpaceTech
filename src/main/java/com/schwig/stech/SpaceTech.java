package com.schwig.stech;

import com.schwig.stech.handler.ConfigHandler;
import com.schwig.stech.init.ModBlocks;
import com.schwig.stech.init.ModItems;
import com.schwig.stech.proxy.IProxy;
import com.schwig.stech.reference.Reference;
import com.schwig.stech.utility.Logger;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class SpaceTech
{
    @Mod.Instance(Reference.MOD_ID)
    public static SpaceTech instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.Init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();
        ModBlocks.init();

        Logger.info("Pre-initialization complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

        Logger.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

        Logger.info("Post-initialization complete!");
    }
}
