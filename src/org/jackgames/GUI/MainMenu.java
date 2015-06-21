package org.jackgames.GUI;

import org.jackgames.engine.Art;
import org.jackgames.engine.Screen;

public class MainMenu extends GUI{

	private final String START="START", OPTIONS="OPTIONS", EXIT="EXIT";
	
	public MainMenu(){
		addButton(new Button(START, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.1f) , Art.apple));
		addButton(new Button(OPTIONS, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.2f) , Art.apple));
		addButton(new Button(EXIT, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.3f) , Art.apple));
	}
	
	@Override
	protected void buttonPressed(Button b) {
		if(b.getName()==START){
			System.out.println("---START---");
		}
	}
	
}
