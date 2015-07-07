package org.jackgames.engine;

import static org.lwjgl.opengl.GL11.GL_BLEND;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_NEAREST;
import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_MAG_FILTER;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glBlendFunc;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glTexParameteri;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex2f;

import org.jackgames.GameClass;
import org.jackgames.level.Hexagon;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;

public class Screen {

	public static final int WIDTH = 1280, HEIGHT = 960;
	public static final int SCALE = 2;
	public static int scrollx=0;
	public static int scrolly =0;
	public static int scrollSpeed =2;
	
	public static void startDisplay(){
		Display.setTitle(GameClass.GAMENAME + " " + GameClass.VERSION);
	try {
		Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
		Display.create();
	} catch (LWJGLException e) {
		// 
		e.printStackTrace();
	}
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(0, WIDTH, HEIGHT, 0, 1, -1);
	glMatrixMode(GL_MODELVIEW);
	glEnable(GL_TEXTURE_2D);
	glEnable(GL_BLEND);
	glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

	

	
}
	
	public static void DrawQuad(float x, float y, float w, float h){
		
		
		glBegin(GL_QUADS);
		glVertex2f(x, y);
		glVertex2f(x+w, y);
		glVertex2f(x+w, y+h);
		glVertex2f(x, y+h);
		glEnd();
		
	}
	
	public static void DrawQuadTexture(float x, float y, float w, float h, Texture tex){
		
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		tex.bind();
		glTranslatef(x, y, 0);
	
		glBegin(GL_QUADS);
		glTexCoord2f(0, 0);
		glVertex2f(0, 0);
		glTexCoord2f(1, 0);
		glVertex2f(w, 0);
		glTexCoord2f(1, 1);
		glVertex2f(w, h);
		glTexCoord2f(0, 1);
		glVertex2f(0, h);
		glEnd();
	//	glScaled(2,  4 , 2);
		glLoadIdentity();
		glTranslatef(0,0, 0);
	
	
		
	}
	
	public static void drawHexagon(float posx, float posy, Texture tex){
		
	        float angle = 0.0f; // angle(in radians) for each vertex
	        float x, y;
	        tex.bind();
	        glTranslatef(posx-Hexagon.H_LENGHT/2, posy-Hexagon.V_LENGHT/2, 0);
	        glBegin(GL11.GL_TRIANGLE_FAN);
	        
	        
	        
	        GL11.glTexCoord2f(1/2.0f, 1/2.0f);
            GL11.glVertex2f(0, 0);
            
            GL11.glTexCoord2f(2/2.0f, 2/2.0f);
            GL11.glVertex2f(Hexagon.LENGHT, 0);
            
            GL11.glTexCoord2f(3/2.0f, 3/2.0f);
            GL11.glVertex2f(Hexagon.LENGHT+Hexagon.HEIGHT, Hexagon.RADIUS);
            
            GL11.glTexCoord2f(4/2.0f, 4/2.0f);
            GL11.glVertex2f(Hexagon.LENGHT, Hexagon.RADIUS*2);
            
            GL11.glTexCoord2f(5/2.0f, 5/2.0f);
            GL11.glVertex2f(0, Hexagon.RADIUS*2);
            
            GL11.glTexCoord2f(6/2.0f, 6/2.0f);
            GL11.glVertex2f(-Hexagon.HEIGHT, Hexagon.RADIUS);
          
           
	        
	        /*   
	            GL11.glTexCoord3f(0.5f, 0.5f, 0.0f);
	            GL11.glVertex3f(0.0f, 0.0f, 0.0f);
	 
	            // divide the circle up into 6 sections(starting from top right)
	            for (int numVertices = 0; numVertices < 6; numVertices++){
	                x = (float)Math.cos(angle);
	                y = (float)Math.sin(angle);
	                angle += 2.0f*(float)Math.PI/6.0f;
	 
	                // map the hexagon coordinates to image coordinates(0...1)
	                GL11.glTexCoord3f((x+1)/2.0f, (y+1)/2.0f, 0.0f);
	                GL11.glVertex3f(Hexagon.RADIUS*x, Hexagon.RADIUS*y, 0.0f);
	            }
	            // last vertex closes the fan (defined explicitely for best precision)
	            GL11.glTexCoord3f(1.0f, 0.5f, 0.0f);
	            GL11.glVertex3f(Hexagon.RADIUS, 0.0f, 0.0f);
	         */   
	        GL11.glEnd();
	    	glLoadIdentity();
	        glTranslatef(0, 0, 0);
	    }
		
	}
	
	
	
	
	


