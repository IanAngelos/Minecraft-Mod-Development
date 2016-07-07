package net.angelos.darksoulsthreeweapons;

import java.util.Random;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {

public static Random random;
public static Random dropChance;
public static int offset;
public static int dropped;


@SubscribeEvent
public void onEntityDrop(LivingDropsEvent event)
{
random = new Random();
offset = random.nextInt(2) + 1; //DO NOT CHANGE THIS

dropChance = new Random();
if((dropped = dropChance.nextInt(10)) <= 2)
{
if(event.getEntityLiving() instanceof EntityCow)
{
event.getEntityLiving().entityDropItem(new ItemStack(Items.bone), offset);
}
}
}

}