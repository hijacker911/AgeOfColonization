package org.jackgames.entity.item;

import org.jackgames.engine.Art;
import org.jackgames.engine.Screen;
import org.jackgames.entity.Entity;
import org.jackgames.interfaces.IStoreable;
import org.newdawn.slick.opengl.Texture;


public class Item extends Entity implements IStoreable{

	protected boolean stored;
	protected String name;
	protected ItemType type;
	
	public String getName() {
		return name;
	}

	public Item(float x, float y, ItemType type){
		super(x,y,type.getWidth(), type.getHeight());
	}

	@Override
	public boolean isStored() {
		return stored;
	}

	@Override
	public void setStored(boolean stored) {
		this.stored = stored;
	}
	
	
	public void render(){
		Screen.DrawQuadTexture(posX, posY, width, height, type.getTexture());
	}
	
	public static class ItemType{
		
		
		//public static final ItemType stone = new ItemType("Stone", "Mainly needed for building", 32, 32, Art.items.getSprite(0), 1);
		
		private String name, desc;
		private int width, height, id;
		private Texture tex;
		
		public ItemType(String name, String desc ,int w, int h, Texture tex, int id){
			this.name=name;
			this.desc = desc;
			this.width =w;
			this.height=h;
			this.tex = tex;
			this.id = id;
		}
		
		public float getHeight() {
			// 
			return width;
		}

		public float getWidth() {
			// 
			return height;
		}

		public Texture getTexture(){
			return tex;
		}
		
		public int getId(){
			return id;
		}
		
		
		public String getName(){
			return name;
		}
		
		public String getDesc(){
			return desc;
		}
	}
	
}



