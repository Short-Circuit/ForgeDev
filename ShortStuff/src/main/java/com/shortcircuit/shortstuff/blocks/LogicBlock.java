package com.shortcircuit.shortstuff.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author ShortCircuit908
 */
public class LogicBlock extends ShortBlock{
	public LogicBlock(){
		super(Material.rock, "logic_gate");
		setStepSound(soundTypeSnow);
		setCreativeTab(CreativeTabs.tabRedstone);
	}
}
