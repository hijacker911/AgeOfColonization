package org.jackgames.entity.worker;

import java.util.HashMap;

import org.jackgames.entity.item.Item;
import org.jackgames.interfaces.IStorage;
import org.jackgames.interfaces.IStoreable;

public class Worker implements IStoreable, IStorage{

	private Item carrying;
	protected float posY, posX;
	
	
	@Override
	public boolean isStored() {
		
		return false;
	}

	@Override
	public void setStored(boolean stored) {
		
		
	}

	@Override
	public int getMaxSlots() {
		return 0;
	}

	@Override
	public int getMaxIStoreablesPerSlot() {
		return 0;
	}

	@Override
	public HashMap<IStoreable, Integer> getItems() {
		return null;
	}

	@Override
	public boolean store(IStoreable i) {
		return false;
	}
	
	

}
