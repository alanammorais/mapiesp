package factories;

import interfaces.AbstractDoor;
import interfaces.AbstractMaze;
import interfaces.AbstractRoom;
import interfaces.AbstractWall;

public abstract class  AbstractFactoryMaze {
	
	public abstract AbstractDoor makeDoor();

	public abstract AbstractMaze makeMaze();

	public abstract AbstractRoom makeRoom();

	public abstract AbstractWall makeWall();

}
