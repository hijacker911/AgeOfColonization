package org.jackgames.GUI;

import java.util.ArrayList;

import org.jackgames.engine.Screen;
import org.lwjgl.input.Mouse;

public class GUI {

	private ArrayList<Button> buttons = new ArrayList<Button>();
	
	public void addButton(Button b){
		buttons.add(b);
	}
	
	public void render(){
		for(Button b: buttons){
			Screen.DrawQuadTexture(b.getPosx(), b.getPosy(), b.getWidth(), b.getHeight(), b.getTexture());
		}
	}
	
	public boolean isButtonPressed(String name){
		float mouseY = Screen.HEIGHT-Mouse.getY()-1;
		Button b = getButton(name);
		
		if(Mouse.getX() > b.getPosx() && Mouse.getX() < b.getPosx() + b.getWidth() &&
				mouseY > b.getPosy() && mouseY < b.getPosy() + b.getHeight() ){
			return true;
		}return false;
		
	}
	
	public Button getButton(String name){
		for(Button b: buttons){
			if(b.getName() == name)return b;
		}
		return null;
	}
	
}
