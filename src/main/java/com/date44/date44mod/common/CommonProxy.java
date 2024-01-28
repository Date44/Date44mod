package com.date44.date44mod.common;

import com.date44.date44mod.common.core.ModBlocks;
import com.date44.date44mod.common.core.ModItems;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy  {

	public void preInit(FMLPreInitializationEvent event) {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
