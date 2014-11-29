package com.killako.GUIOres.init;

import com.killako.GUIOres.item.ItemGUIOres;
import com.killako.GUIOres.item.ItemVortex;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemGUIOres vortex = new ItemVortex();

    public static void init()
    {
        GameRegistry.registerItem(vortex, "vortex");
    }
}
