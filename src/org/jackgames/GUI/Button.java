package org.jackgames.GUI;

import org.newdawn.slick.opengl.Texture;

public class Button {

	private String name;
	private int posx,posy;
	private int width, height;
	private Texture texture;
	
	public Button(String buttonname, int x, int y, Texture tex){
		this.name = buttonname;
		this.posx = x;
		this.posy = y;
		this.texture = tex;
		this.width = texture.getImageWidth();
		this.height = texture.getImageHeight();
	}
	
	public Button(String buttonname, int x, int y, int w, int h , Texture tex){
		this.name = buttonname;
		this.posx = x;
		this.posy = y;
		this.texture = tex;
		this.width = w;
		this.height = h;
	}

	public int getPosx() {
		return posx;
	}

	public int getPosy() {
		return posy;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Texture getTexture() {
		return texture;
	}

	public String getName() {
		return name;
	}
	
	
	
}
