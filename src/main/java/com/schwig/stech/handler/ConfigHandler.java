package com.schwig.stech.handler;

import java.io.File;

import com.schwig.stech.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{
    public static Configuration config;
    public static boolean testVal = false;

    public static void Init(File configFile)
    {
        // Create config obj from given config file
        if(config ==null)
        {
            config = new Configuration(configFile);
            LoadConfig();
        }


    }

    @SubscribeEvent
    public void OnConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            // Resync configs

        }
    }

    private static void LoadConfig()
    {
        testVal = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Test value.");

        if(config.hasChanged())
        {
            config.save();
        }
    }
}
