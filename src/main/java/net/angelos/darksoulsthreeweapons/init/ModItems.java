package net.angelos.darksoulsthreeweapons.init;

import java.util.HashSet;
import java.util.Set;

import net.angelos.darksoulsthreeweapons.item.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static final Set<Item> ITEMS = new HashSet<>();
	
	public static final Rapier Rapier;
	
	static {
		Rapier = register(new Rapier(Item.ToolMaterial.WOOD, "Rapier"));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		ITEMS.add(item);
		
		return item;
	}
	
	public static void registerItems() {
		// Dummy method to make sure the static initializer runs
	}
}

