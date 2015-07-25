package org.jackgames.GUI;

import org.jackgames.engine.Art;
import org.jackgames.engine.Screen;

public class LevelMenu extends GUI{

	
	public LevelMenu(){
		addButton(new Button("START", Screen.WIDTH-128, Screen.HEIGHT-64, Art.startButton));
		addButton(new Button("BACK"));
		
	}
}
