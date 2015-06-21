package org.jackgames.engine;

import java.io.IOException;
import java.io.InputStream;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Art {

	//public static final Texture baseTile = loadTexture("res/baseTile.png", "PNG");
	public static final Texture apple = loadTexture("res/entities/apple.png", "PNG");
	
	//public static final Texture mainMenue = loadTexture("res/ui/mainMenue.png", "PNG");


public static Texture loadTexture(String path, String fileType){
	Texture tex = null;

	InputStream in = ResourceLoader.getResourceAsStream(path);
	try {
		tex = TextureLoader.getTexture(fileType, in);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return tex;
}
}
