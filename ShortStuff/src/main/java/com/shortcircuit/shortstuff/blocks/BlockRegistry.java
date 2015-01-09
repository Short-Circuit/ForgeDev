package com.shortcircuit.shortstuff.blocks;

import com.shortcircuit.shortstuff.ShortStuff;
import com.shortcircuit.shortstuff.helpers.ShortRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author ShortCircuit908
 */
public class BlockRegistry<T extends ShortBlock> extends ShortRegistry<T>{
	@Override
	public void register(T object){
		GameRegistry.registerBlock(object, ShortStuff.MODID + "_" + object.getUnlocalizedName().substring(5));
	}
}
