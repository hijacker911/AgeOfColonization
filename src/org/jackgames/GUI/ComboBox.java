package org.jackgames.GUI;

import java.util.List;

import org.newdawn.slick.opengl.Texture;

public class ComboBox {

	private String name;
	private int posx,posy;
	private int width, height;
	private Texture texture;
	private String selectedOption;
	
	public ComboBox(String buttonname, int x, int y, String ...strings ){
		this.name = buttonname;
		this.posx = x;
		this.posy = y;
		this.width = texture.getImageWidth();
		this.height = texture.getImageHeight();
	}
	
	public ComboBox(String buttonname, int x, int y, int w, int h, String ...strings){
		this.name = buttonname;
		this.posx = x;
		this.posy = y;
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
	
	public List<String> getOptions(){
		return null;
	}
	
	public String getSelectedOption(){
		return selectedOption;
	}
}
