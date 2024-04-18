package com.macskacico.mgrrdiscs;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import java.util.Random;

public class MobDropsHandler
{
    Random rand = new Random();
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event)
    {
        if (event.entity instanceof EntitySkeleton)
        {
            if(event.source.getEntity() instanceof EntityCreeper) {
                int rand_int = rand.nextInt(13);

                ItemStack stack_rey = new ItemStack(ModItems.record_rey);
                ItemStack stack_raiden1 = new ItemStack(ModItems.record_raiden1);
                ItemStack stack_bladewolf = new ItemStack(ModItems.record_bladewolf);
                ItemStack stack_mistral = new ItemStack(ModItems.record_mistral);
                ItemStack stack_raiden2 = new ItemStack(ModItems.record_raiden2);
                ItemStack stack_monsoon = new ItemStack(ModItems.record_monsoon);
                ItemStack stack_sundowner = new ItemStack(ModItems.record_sundowner);
                ItemStack stack_raiden3 = new ItemStack(ModItems.record_raiden3);
                ItemStack stack_sam = new ItemStack(ModItems.record_sam);
                ItemStack stack_khamsin = new ItemStack(ModItems.record_khamsin);
                ItemStack stack_excelsus = new ItemStack(ModItems.record_excelsus);
                ItemStack stack_armstrong = new ItemStack(ModItems.record_armstrong);
                ItemStack stack_end = new ItemStack(ModItems.record_end);
                switch (rand_int) {
                    case 0:
                        EntityItem drop0 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack_rey);
                        event.drops.add(drop0);
                        break;
                    case 1:
                        EntityItem drop1 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack_raiden1);
                        event.drops.add(drop1);
                        break;
                    case 2:
                        EntityItem drop2 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_bladewolf);
                        event.drops.add(drop2);
                        break;
                    case 3:
                        EntityItem drop3 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_mistral);
                        event.drops.add(drop3);
                        break;
                    case 4:
                        EntityItem drop4 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_raiden2);
                        event.drops.add(drop4);
                        break;
                    case 5:
                        EntityItem drop5 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_monsoon);
                        event.drops.add(drop5);
                        break;
                    case 6:
                        EntityItem drop6 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_sundowner);
                        event.drops.add(drop6);
                        break;
                    case 7:
                        EntityItem drop7 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_raiden3);
                        event.drops.add(drop7);
                        break;
                    case 8:
                        EntityItem drop8 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_sam);
                        event.drops.add(drop8);
                        break;
                    case 9:;
                        EntityItem drop9 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_khamsin);
                        event.drops.add(drop9);
                        break;
                    case 10:
                        EntityItem drop10 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_excelsus);
                        event.drops.add(drop10);
                        break;
                    case 11:
                        EntityItem drop11 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_armstrong);
                        event.drops.add(drop11);
                        break;
                    case 12:
                        EntityItem drop12 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_end);
                        event.drops.add(drop12);
                        break;
                    default:
                        EntityItem drop13 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ,stack_rey);
                        event.drops.add(drop13);
                }


            }

        }

    }

}