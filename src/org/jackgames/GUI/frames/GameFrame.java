package org.jackgames.GUI.frames;

import org.jackgames.GUI.GUI;
import org.jackgames.engine.Art;
import org.jackgames.engine.Screen;

public class GameFrame extends GUI {

	private int posx, posy, type, width, height;
	private boolean shouldpause;
	
	public GameFrame(int x, int y, int type, boolean pause, int width, int height){
		this.posx = x;
		this.posy = y;
		this.width = width;
		this.height = height;
		this.type = type;
		this.shouldpause = pause;
	}
	
	
	@Override
	public void render() {
		Screen.DrawQuadTexture(posx, posy, width, height, Art.testTile);
		super.render();
	}
	
	
}
