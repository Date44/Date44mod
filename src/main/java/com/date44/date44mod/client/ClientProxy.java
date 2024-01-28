package com.date44.date44mod.client;

import com.date44.date44mod.client.block.*;
import com.date44.date44mod.client.chat.CommandGlobalChat;
import com.date44.date44mod.common.tiles.TileEntityBlock;
import com.date44.date44mod.common.tiles.TileEntityBlock2;
import com.date44.date44mod.common.tiles.TileEntityBlock3;
import com.date44.date44mod.client.casino.Opencasino;
import com.date44.date44mod.common.CommonProxy;
import com.date44.date44mod.common.core.ModBlocks;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		TileEntitySpecialRenderer render = new blockStolik();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlock.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.M1), new ItemRenderBlock(render, new TileEntityBlock()));

		TileEntitySpecialRenderer render1 = new blockStyl();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlock2.class, render1);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.M2), new ItemRenderBlock(render1, new TileEntityBlock2()));

		TileEntitySpecialRenderer render2 = new blockStats();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlock3.class, render2);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.M3), new ItemRenderBlock(render2, new TileEntityBlock3()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		net.minecraftforge.client.ClientCommandHandler.instance.registerCommand(new CommandSet());
		net.minecraftforge.client.ClientCommandHandler.instance.registerCommand(new Opencasino());
		net.minecraftforge.client.ClientCommandHandler.instance.registerCommand(new CommandGlobalChat());
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
