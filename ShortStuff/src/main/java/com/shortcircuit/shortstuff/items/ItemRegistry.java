package com.shortcircuit.shortstuff.items;

import com.shortcircuit.shortstuff.ShortStuff;
import com.shortcircuit.shortstuff.helpers.ShortRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author ShortCircuit908
 */
public class ItemRegistry<T extends ShortItem> extends ShortRegistry<T>{
	@Override
	public void register(T object){
		GameRegistry.registerItem(object, ShortStuff.MODID + "_" + object.getUnlocalizedName().substring(5), ShortStuff.MODID);
	}
}
