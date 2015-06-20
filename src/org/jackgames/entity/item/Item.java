package org.jackgames.entity.item;

import org.jackgames.entity.Entity;
import org.jackgames.interfaces.IStoreable;


public class Item extends Entity implements IStoreable{

	protected float posX, PosY;
	protected boolean stored;
	protected String name;
	
	
	public String getName() {
		return name;
	}

	public Item(String name){
		this.name=name;
	}

	@Override
	public boolean isStored() {
		return stored;
	}

	@Override
	public void setStored(boolean stored) {
		this.stored = stored;
	}
	

	
	
}
