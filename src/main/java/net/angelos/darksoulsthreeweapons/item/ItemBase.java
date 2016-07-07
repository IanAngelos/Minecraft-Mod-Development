package net.angelos.darksoulsthreeweapons.item;

import net.angelos.darksoulsthreeweapons.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	public ItemBase(String itemName) {
		setItemName(this, itemName);
		setCreativeTab(Main.creativeTab);
	}

	public static void setItemName(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
}