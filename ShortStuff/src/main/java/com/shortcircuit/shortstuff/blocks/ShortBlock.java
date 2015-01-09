package com.shortcircuit.shortstuff.blocks;

import com.shortcircuit.shortstuff.ShortStuff;
import com.sun.javafx.beans.annotations.NonNull;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author ShortCircuit908
 */
public class ShortBlock extends Block{

	protected ShortBlock(Material p_i45394_1_, @NonNull String unlocalized_name){
		super(p_i45394_1_);
		setBlockName(unlocalized_name);
		setBlockTextureName(ShortStuff.MODID + ":" + unlocalized_name);
	}

}
