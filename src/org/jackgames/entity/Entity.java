package org.jackgames.entity;

public abstract class Entity {

	protected float posX, posY;
	protected float width, height;
	
	
	public Entity(float x, float y){
		posX = x;
		posY = y;
		width = 32;
		height = 32;
	}
	
	public Entity(float x, float y, float w, float h){
		posX = x;
		posY = y;
		width = w;
		height = h;
	}
	
	public void render(){
		
	}
	
	public void update(){
		
	}
	
	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}
