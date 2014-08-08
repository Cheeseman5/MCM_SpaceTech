package com.schwig.stech.configuration;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
    public static void Init(File configFile)
    {
        // Create config obj from given config file
        Configuration configuration = new Configuration(configFile);

        try
        {
            // Load config file
            configuration.load();

            // Read in properties from config file
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example config value.").getBoolean(true);
        }
        catch (Exception e)
        {
            //TODO: log exception
        }
        finally
        {
            configuration.save();
        }
    }
}
