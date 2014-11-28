package com.killako.GUIOres;

import com.killako.GUIOres.handlers.ConfigurationHandler;
import com.killako.GUIOres.proxies.IProxy;
import com.killako.GUIOres.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modid, name = Reference.modname, version = Reference.version, guiFactory = Reference.guifactory)
public class GUIOres
{
    @Mod.Instance(Reference.modid)
    public static GUIOres instance;

    @SidedProxy(clientSide = Reference.clientprox,serverSide = Reference.serverprox)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
