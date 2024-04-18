package com.macskacico.mgrrdiscs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {


    public static Item record_rey;
    public static Item record_raiden1;
    public static Item record_bladewolf;
    public static Item record_mistral;
    public static Item record_raiden2;
    public static Item record_monsoon;
    public static Item record_sundowner;
    public static Item record_raiden3;
    public static Item record_sam;
    public static Item record_khamsin;
    public static Item record_excelsus;
    public static Item record_armstrong;
    public static Item record_end;
    public static void init()
    {
        /*
         = new MusicDisc("").setUnlocalizedName("record_").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(, .getUnlocalizedName());
         */

        record_rey = new MusicDisc("rules_of_nature").setUnlocalizedName("record_rules_of_nature").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_rey, record_rey.getUnlocalizedName());

        record_raiden1 = new MusicDisc("dark_skies").setUnlocalizedName("record_dark_skies").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_raiden1, record_raiden1.getUnlocalizedName());

        record_bladewolf= new MusicDisc("im_my_own_master_now").setUnlocalizedName("record_im_my_own_master_now").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_bladewolf, record_bladewolf.getUnlocalizedName());

        record_mistral = new MusicDisc("a_stranger_i_remain").setUnlocalizedName("record_a_stranger_i_remain").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_mistral, record_mistral.getUnlocalizedName());

        record_raiden2 = new MusicDisc("return_to_ashes").setUnlocalizedName("record_return_to_ashes").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_raiden2, record_raiden2.getUnlocalizedName());

        record_monsoon = new MusicDisc("the_stains_of_time").setUnlocalizedName("record_the_stains_of_time").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_monsoon, record_monsoon.getUnlocalizedName());

        record_sundowner = new MusicDisc("red_sun").setUnlocalizedName("record_red_sun").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_sundowner, record_sundowner.getUnlocalizedName());

        record_raiden3 = new MusicDisc("a_soul_cant_be_cut").setUnlocalizedName("record_a_soul_cant_be_cut").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_raiden3, record_raiden3.getUnlocalizedName());

        record_sam = new MusicDisc("the_only_thing_i_know_for_real").setUnlocalizedName("record_the_only_thing_i_know_for_real").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_sam, record_sam.getUnlocalizedName());

        record_khamsin = new MusicDisc("the_hot_wind_blowing").setUnlocalizedName("record_the_hot_wind_blowing").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_khamsin, record_khamsin.getUnlocalizedName());

        record_excelsus = new MusicDisc("collective_consciousness").setUnlocalizedName("record_collective_consciousness").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_excelsus, record_excelsus.getUnlocalizedName());

        record_armstrong = new MusicDisc("it_has_to_be_this_way").setUnlocalizedName("record_it_has_to_be_this_way").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_armstrong, record_armstrong.getUnlocalizedName());

        record_end = new MusicDisc("the_war_still_rages_within").setUnlocalizedName("record_the_war_still_rages_within").setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(record_end, record_end.getUnlocalizedName());


    }
}



