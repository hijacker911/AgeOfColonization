package org.jackgames.GUI;

import org.jackgames.engine.Art;
import org.jackgames.engine.Screen;

public class MainMenu extends GUI{

	private final String START="START", OPTIONS="OPTIONS", EXIT="EXIT";
	private GUI currentGui;
	private LevelMenu lm;
	
	public MainMenu(){
		addButton(new Button(START, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.1f) , Art.startButton));
		addButton(new Button(OPTIONS, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.3f) , Art.exitButton));
		addButton(new Button(EXIT, (int)((Screen.WIDTH/2) * 0.1f), (int)((Screen.HEIGHT/2)*0.5f) , Art.items.getSprite(8)));
		
		lm = new LevelMenu();
		
		currentGui = this;
	}
	
	@Override
	protected void buttonPressed(Button b) {
		if(b.getName()==START){
			currentGui = lm;
		}if(b.getName()==OPTIONS){
			System.out.println("---Options---");
		}if(b.getName()==EXIT){
			System.exit(0);
		}
	}
	
	public void render(){
		
		
		if(currentGui != this){
		currentGui.render();
	
		}else{
			Screen.DrawQuadTexture(0, 0, Screen.WIDTH, Screen.HEIGHT, Art.mainMenue);
			super.render();
		}
	
	//	Screen.DrawQuadTexture(70, 70, 32, 32, Art.mainMenue);
	}
	
	@Override
	public void update() {
		if(this==currentGui){
		super.update();
		}else
			currentGui.update();
	}
	
}
