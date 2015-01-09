package com.shortcircuit.shortstuff;

import com.shortcircuit.shortstuff.blocks.BlockRegistry;
import com.shortcircuit.shortstuff.blocks.LogicBlock;
import com.shortcircuit.shortstuff.blocks.ShortBlock;
import com.shortcircuit.shortstuff.blocks.WireBlock;
import com.shortcircuit.shortstuff.items.ItemRegistry;
import com.shortcircuit.shortstuff.items.ShortItem;
import com.shortcircuit.shortstuff.items.WireItem;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ShortStuff.MODID, version = ShortStuff.VERSION, dependencies="after:ForgeMultipart")
public class ShortStuff{
	public static final String MODID = "shortstuff";
	public static final String VERSION = "1.0";
	private BlockRegistry<ShortBlock> block_registry = new BlockRegistry<>();
	private ItemRegistry<ShortItem> item_registry = new ItemRegistry<>();
	@EventHandler
	public void init(FMLInitializationEvent event){
		try{
			Desktop.getDesktop().browse(new URI("http://ask-backy.tumblr.com"));
		}
		catch(URISyntaxException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		block_registry.addObject(new LogicBlock());
		block_registry.addObject(new WireBlock());
		block_registry.registerAll();

		item_registry.addObject(new WireItem());
		item_registry.registerAll();
	}
	public BlockRegistry<ShortBlock> getBlockRegistry(){
		return block_registry;
	}
	public ItemRegistry<ShortItem> getItemRegistry(){
		return item_registry;
	}
}
