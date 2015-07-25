package org.jackgames.engine;

import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.jackgames.GameClass;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class SpriteSheet {
	private String path;
	private final int SIZE;
	public int[] pixels;
	private int pixelWidth, pixelHeight, width, height, spritewidth;
	BufferedImage image;



	public SpriteSheet(String path, int size) {
		this.path = path;
		spritewidth=size;
		load();
		SIZE = width*height;
	}

	private void load() {
		try {
			image = ImageIO.read(GameClass.class.getResource(path));
			pixelWidth = image.getWidth();
			pixelHeight = image.getHeight();
			
			this.width = pixelWidth/spritewidth;
			this.height = pixelHeight/spritewidth;
			
			image.getRGB(0, 0, pixelWidth, pixelHeight, pixels, 0, pixelWidth);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Texture getSprite(int index){
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		
		try {
			ImageIO.write(image.getSubimage((index%width)*32, (index/width)*32, spritewidth, spritewidth), "PNG", os);
			InputStream is = new ByteArrayInputStream(os.toByteArray());
		

			return TextureLoader.getTexture("PNG", is);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;}

}