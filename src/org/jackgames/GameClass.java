package org.jackgames;

import org.jackgames.GUI.MainMenu;
import org.jackgames.engine.Screen;
import org.jackgames.level.Hexagon;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class GameClass {
	
	public static final String VERSION ="InDev 0.0.1";
	public static final String GAMENAME ="Age of Colonization";
	
	
	
	public static void main(String[] args){
		new GameClass();
	}
	
	public GameClass(){
		Hexagon.init();
		Screen.startDisplay();
		MainMenu menu = new MainMenu();
		

		
	while(!Display.isCloseRequested()){

		
		
		menu.update();
		menu.render();
		//menu.render();
		/*if(Keyboard.isKeyDown(Keyboard.KEY_W)){
			Screen.scrolly-=Screen.scrollSpeed;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D)){
			Screen.scrollx+=Screen.scrollSpeed;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_S)){
			Screen.scrolly+=Screen.scrollSpeed;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_A)){
			Screen.scrollx-=Screen.scrollSpeed;
		}*/
		GL11.glFinish();
		Display.update();
			Display.sync(40);
		

		}
		Display.destroy();

		}
	
}
