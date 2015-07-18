package org.jackgames.level;

import org.jackgames.engine.Art;
import org.jackgames.engine.Screen;


public class Hexagon {

	private float posx, posy;
	private boolean uneven=false;
	
	public static final int LENGHT= 5;
	public static float RADIUS, HEIGHT, V_LENGHT, H_LENGHT;
	
	public static void init() {
		RADIUS= (float) (Math.cos(Math.toRadians(30) )*LENGHT);
		HEIGHT = (float) (Math.sin(Math.toRadians(30) )*LENGHT);
		H_LENGHT = 2*HEIGHT + LENGHT;
		V_LENGHT = 2*RADIUS;

	}
	
	public Hexagon(float x, float f){
		this.posx = x;
		this.posy = f;
	}
	

	public void render(){
		if(uneven){
			Screen.drawHexagon(posx, posy, Art.testTile2);
		}else
			Screen.drawHexagon(posx, posy, Art.testTile);
		
	}
	
	public void setUneven(){
		uneven = true;
	}
	
	
}

