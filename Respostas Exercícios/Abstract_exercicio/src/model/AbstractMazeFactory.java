package model;

import model.elementos.AbstractRoom;

public abstract class AbstractMazeFactory {
	
	public AbstractMazeFactory(){}
	
	public abstract void makeRoom();
	
	public abstract void makeMaze();
	
	public abstract void makeWall();
	
	public abstract void makeDoor();
	
	public abstract AbstractRoom getInstance();
}
