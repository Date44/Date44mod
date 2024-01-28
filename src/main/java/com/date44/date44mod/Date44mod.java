package com.date44.date44mod;

import com.date44.date44mod.client.block.CommandSet;
import com.date44.date44mod.client.casino.Opencasino;
import com.date44.date44mod.common.CommonProxy;
import com.date44.date44mod.common.build.Blockbuild;
import com.date44.date44mod.common.build.Slabbuild;
import com.date44.date44mod.common.build.Stairsbuild;
import com.date44.date44mod.common.build.itembuild;
import com.date44.date44mod.common.core.ModBlocks;
import com.date44.date44mod.common.core.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import com.date44.date44mod.common.build.VisibleOnlyForPlayersBlock;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import org.bukkit.event.EventHandler;

@Mod(modid = Date44mod.MODID, version = Date44mod.VERSION, name = Date44mod.NAME, modLanguage = "Java", bukkitPlugin = Date44mod.MODID)
public class Date44mod
{
    public static final Date44mod instance = new Date44mod();
    public static final CreativeTabs tabDate44mod = new CreativeTabs("tabDate44mod") {
        @Override
        public Item getTabIconItem() {return Item.getItemFromBlock(Blocks.stone);}
    };

    public static final String MODID = "date44mod";
    public static final String NAME = "Mystical Shadows";
    public static final String VERSION = "0.0.1";

    @SidedProxy(
            clientSide = "com.date44.date44mod.client.ClientProxy",
            serverSide = "com.date44.date44mod.server.ServerProxy"
    )
    public static CommonProxy Date44proxy;

    public Date44mod() {
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        Date44proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Date44proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Date44proxy.postInit(event);
    }




}
