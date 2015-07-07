package org.jackgames;

import java.util.ArrayList;
import java.util.List;

import org.jackgames.GUI.GUI;
import org.jackgames.GUI.MainMenu;
import org.jackgames.engine.Screen;
import org.jackgames.level.Hexagon;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class GameClass {
	
	public static final String VERSION ="InDev 0.0.1";
	public static final String GAMENAME ="Age of Colonization";
	public ArrayList<Hexagon> gons = new ArrayList<Hexagon>();
	
	
	public static void main(String[] args){
		new GameClass();
	}
	
	public GameClass(){
		Hexagon.init();
		Screen.startDisplay();
		float posx = 70;
		float posy = 70;
		MainMenu menu = new MainMenu();
		int gonsies=0;
		double plusJ = 0.75f*Hexagon.H_LENGHT;
		for(float i =0; i < Screen.HEIGHT; i+=Hexagon.RADIUS){
			gonsies++;
			boolean build=false;
			for(float j =0; j < Screen.WIDTH; j+=plusJ){
				if(build){

				Hexagon hex=null;
				
				if(gonsies%2==0){
					hex=  new Hexagon(j, i);
				}else{
					
					 hex =new Hexagon((float)(j+plusJ), i);
					 hex.setUneven();
				}
				gons.add(hex);
			}
				build =!build;
			}
			
		
		}

		
	while(!Display.isCloseRequested()){

		
		for(Hexagon gon : gons)
			gon.render();
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
