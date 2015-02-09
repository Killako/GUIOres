package com.killako.GUIOres.creativetab;

import com.killako.GUIOres.init.ModItems;
import com.killako.GUIOres.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabGUIOres
{
    public static final CreativeTabs GUIOresTab = new CreativeTabs(Reference.modid.toLowerCase()) {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.vortex;
        }
    };
}
