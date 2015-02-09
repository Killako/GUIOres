package com.killako.GUIOres.init;


import com.killako.GUIOres.block.BlockGUIAluminiumOre;
import com.killako.GUIOres.block.BlockGUIOres;
import com.killako.GUIOres.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.modid)
public class ModBlocks
{
    public static final BlockGUIOres guiAluminiumOre = new BlockGUIAluminiumOre();

    public static void init()
    {
        GameRegistry.registerBlock(guiAluminiumOre, "guiAluminiumOre");
    }
}
