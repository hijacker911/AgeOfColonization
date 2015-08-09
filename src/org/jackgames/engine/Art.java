package org.jackgames.engine;

import java.io.IOException;
import java.io.InputStream;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Art {

	//public static final Texture baseTile = loadTexture("res/baseTile.png", "PNG");
	public static final Texture apple = loadTexture("entities/apple.png", "PNG");
	
	public static final Texture mainMenue = loadTexture("ui/mainMenue.png", "PNG");
	public static final Texture testTile = loadTexture("tiles/test.png", "PNG");
	public static final Texture testTile2 = loadTexture("tiles/test2.png", "PNG");
	public static final SpriteSheet items = new SpriteSheet("/items/items.png", 32);
	//public static final Texture stone = loadTexture("res/items/stone.png", "PNG");

	public static final Texture startButton = loadTexture("ui/buttonStart.png", "PNG");
	public static final Texture exitButton = loadTexture("ui/buttonExit.png", "PNG");

	public static Texture loadTexture(String path, String fileType){
	
		Texture tex = null;

		InputStream in = ResourceLoader.getResourceAsStream(path);
		try {
			tex = TextureLoader.getTexture(fileType, in);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tex;
	}
}
