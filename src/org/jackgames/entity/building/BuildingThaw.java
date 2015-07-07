package org.jackgames.entity.building;

import java.util.HashMap;

import org.jackgames.interfaces.IStorage;
import org.jackgames.interfaces.IStoreable;


/**
 * 
 * @author Flox<br/>
 * <body>Schmelze</body>
 */
public class BuildingThaw extends Building implements IStorage{

	public BuildingThaw(float x, float y) {
		super(x, y);
		// 
	}

	@Override
	public int getMaxSlots() {
		// 
		return 4;
	}

	@Override
	public int getMaxIStoreablesPerSlot() {
		// 
		return 0;
	}

	@Override
	public HashMap<IStoreable, Integer> getItems() {
		// 
		return null;
	}

	@Override
	public boolean store(IStoreable i) {
		// 
		return false;
	}

	
	
	
}
