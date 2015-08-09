package org.jackgames.interfaces;
import java.util.HashMap;


public interface IStorage {

	public int getMaxSlots();
	
	public int getMaxIStoreablesPerSlot();
	
	public HashMap<IStoreable, Integer> getItems();
	
	public boolean store(IStoreable i);
	
}
