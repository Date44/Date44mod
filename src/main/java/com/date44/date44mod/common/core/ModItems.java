package com.date44.date44mod.common.core;import com.date44.date44mod.common.build.RingBuild;import com.date44.date44mod.common.build.itembuild;import net.minecraft.item.Item;public class ModItems {	public static Item I1;	public static Item I2;	public static Item R1;	public static void registerItems() {		// Items		I1 = (new itembuild("I1"));		I2 = (new itembuild("I2"));		R1 = (new RingBuild("R1"));	}}