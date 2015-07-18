package org.jackgames.entity.item;

import java.util.ArrayList;

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
		
		//TODO Sprites überprüfen
		public static final ItemType stone = new ItemType("Stone", "Mainly needed for building", 32, 32, Art.items.getSprite(10));
		public static final ItemType log = new ItemType("Log", "Needed to produce boards", 32, 32, Art.items.getSprite(8));
		public static final ItemType boards = new ItemType("Boards", "Mainly needed for building", 32, 32, Art.items.getSprite(9));
		public static final ItemType ironIngot = new ItemType("Iron Ingot", " - ", 32, 32, Art.items.getSprite(0));
		public static final ItemType goldIngot = new ItemType("Gold Ingot", "Used as currency", 32, 32, Art.items.getSprite(2));
		public static final ItemType steelIngot = new ItemType("Steel Ingot", " Better than Iron", 32, 32, Art.items.getSprite(1));
		public static final ItemType flodyllIngot = new ItemType("Flodyll Ingot", "Magical Ingot", 32, 32, Art.items.getSprite(3));
		public static final ItemType ironOre = new ItemType("Iron Ore", "Needed to smelt Iron Ingots", 32, 32, Art.items.getSprite(4));
		public static final ItemType goldOre = new ItemType("Gold Ore", "Needed to smelt Gold Ingots", 32, 32, Art.items.getSprite(6));
		public static final ItemType coal = new ItemType("Coal", "Needed for smelting and smithing", 32, 32, Art.items.getSprite(5));
		public static final ItemType flodyllore = new ItemType("Flodyll Ore", "Magical Ore", 32, 32, Art.items.getSprite(7));
		
		public static ArrayList<ItemType> items = new ArrayList<ItemType>();
		
		
		private String name, desc;
		private int width, height, id;
		private Texture tex;
		public static int IdCount=1;
		
		public ItemType(String name, String desc ,int w, int h, Texture tex){
			this.name=name;
			this.desc = desc;
			this.width =w;
			this.height=h;
			this.tex = tex;
			this.id = IdCount++;
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



