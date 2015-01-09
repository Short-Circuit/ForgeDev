package com.shortcircuit.shortstuff.multipart;

import net.minecraft.block.Block;

import codechicken.lib.vec.Cuboid6;
import codechicken.multipart.minecraft.McSidedMetaPart;

/**
 * @author ShortCircuit908
 */
public class WirePart extends McSidedMetaPart{
	public WirePart(){
		super();
	}
	@Override
	public int sideForMeta(int i){
		return 0;
	}

	@Override
	public Block getBlock(){
		return null;
	}

	@Override
	public Cuboid6 getBounds(){
		return null;
	}

	@Override
	public String getType(){
		return null;
	}

}
