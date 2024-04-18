package com.macskacico.mgrrdiscs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.macskacico.mgrrdiscs.ModItems.record_rey;

public class ModCreativeTabs {
    public static CreativeTabs DiscTab = new CreativeTabs("MGRR Discs") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return record_rey.getContainerItem();
        }
    };
}