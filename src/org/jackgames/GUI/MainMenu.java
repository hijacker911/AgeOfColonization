package org.jackgames.GUI;

import org.jackgames.engine.Art;
import org.jackgames.engine.Screen;

public class MainMenu extends GUI{

	private final String START="START", OPTIONS="OPTIONS", EXIT="EXIT";
	
	public MainMenu(){
		addButton(new Button(START, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.1f) , Art.items.getSprite(0)));
		addButton(new Button(OPTIONS, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.2f) , Art.items.getSprite(5)));
		addButton(new Button(EXIT, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.3f) , Art.items.getSprite(8)));
	}
	
	@Override
	protected void buttonPressed(Button b) {
		if(b.getName()==START){
			System.out.println("---START---");
		}if(b.getName()==OPTIONS){
			System.out.println("---Options---");
		}if(b.getName()==EXIT){
			System.out.println("---Exit---");
		}
	}
	
	public void render(){
		super.render();
		Screen.DrawQuadTexture(70, 70, 32, 32, Art.mainMenue);
	}
	
}
