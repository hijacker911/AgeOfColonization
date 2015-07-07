package org.jackgames.GUI;

import java.util.ArrayList;

import org.jackgames.engine.Screen;
import org.lwjgl.input.Mouse;

public abstract class GUI {

	private ArrayList<Button> buttons = new ArrayList<Button>();
	
	public void addButton(Button b){
		buttons.add(b);
	}
	
	public void render(){
		for(Button b: buttons){
			Screen.DrawQuadTexture(b.getPosx(), b.getPosy(), b.getWidth(), b.getHeight(), b.getTexture());
		}
	}
	
	public boolean isButtonPressed(Button b){
		float mouseY = Screen.HEIGHT-Mouse.getY()-1;
		float mouseX = Mouse.getX();
		//System.out.println("MouseX " + mouseX + " MouseY " + mouseY);
	//	System.out.println("Button1 " +b.getPosx() + "," + b.getPosy() + "   Button2 " + (b.getPosx()+b.getWidth()) + "," + (b.getPosy() + b.getHeight()));
		
		if(mouseX > b.getPosx() && mouseX < b.getPosx() + b.getWidth() &&
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
	
	public void update(){
		updateButtons();
	}
	
	public void updateButtons(){
		if(Mouse.isButtonDown(0)){
			for(Button b: buttons)
			if(isButtonPressed(b)){
				buttonPressed(b);
			}
		
		}
	}

	protected void buttonPressed(Button b) {
		
		
	}
}
