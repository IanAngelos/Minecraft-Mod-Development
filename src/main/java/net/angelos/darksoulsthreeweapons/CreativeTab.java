package net.angelos.darksoulsthreeweapons;

import net.angelos.darksoulsthreeweapons.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class CreativeTab extends CreativeTabs {

	public CreativeTab() {
		super(Main.modId);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Item getTabIconItem() {
		return ModItems.Rapier;
	}
}