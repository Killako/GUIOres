package com.killako.GUIOres.handlers;

import com.killako.GUIOres.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.modid))
        {
            loadConfiguration();
        }
    }

    public void loadConfiguration()
    {
        testValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example configValue").getBoolean(true);
        if (configuration.hasChanged())
        {
            configuration.save();
        }

    }


}