package org.jackgames.level;

import java.util.ArrayList;

import org.jackgames.engine.Screen;

public class Level {

	private ArrayList<Hexagon> gons = new ArrayList<Hexagon>();
	
	public Level(){
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
	}
	
	
	public void render(){
		for(Hexagon gon : gons)
			gon.render();
	}
	
}
