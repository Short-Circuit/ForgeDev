package com.shortcircuit.shortstuff.helpers;

import java.util.LinkedList;

/**
 * @author ShortCircuit908
 */
public abstract class ShortRegistry<T extends Object>{
	private LinkedList<T> objects = new LinkedList<>();
	protected abstract void register(T object);
	public void registerAll(){
		for(T object : objects){
			register(object);
		}
	}
	public void addObject(T object){
		objects.add(object);
	}
}
