package org.jackgames.entity.worker;

import org.jackgames.entity.item.Item;
import org.jackgames.interfaces.IStoreable;

public class Worker implements IStoreable{

	private Item costs;
	protected float posY, posX;
	
	
	@Override
	public boolean isStored() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setStored(boolean stored) {
		// TODO Auto-generated method stub
		
	}
	
	

}
