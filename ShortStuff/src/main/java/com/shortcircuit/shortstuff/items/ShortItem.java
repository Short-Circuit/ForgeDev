package com.shortcircuit.shortstuff.items;

import com.shortcircuit.shortstuff.ShortStuff;
import com.sun.javafx.beans.annotations.NonNull;

import net.minecraft.item.Item;

/**
 * @author ShortCircuit908
 */
public class ShortItem extends Item{
	public ShortItem(@NonNull String unlocalized_name){
		super();
		setUnlocalizedName(unlocalized_name);
		setTextureName(ShortStuff.MODID + ":" + unlocalized_name);
	}
}
