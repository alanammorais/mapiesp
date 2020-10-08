package factories;

import interfaces.AbstractDoor;
import interfaces.AbstractMaze;
import interfaces.AbstractRoom;
import interfaces.AbstractWall;
import simple.SimpleDoor;
import simple.SimpleMaze;
import simple.SimpleRoom;
import simple.SimpleWall;

public class FactoryMaze extends AbstractFactoryMaze {
	
	@Override
	public AbstractDoor makeDoor() {
		return new SimpleDoor();
	}

	@Override
	public AbstractMaze makeMaze() {
		return new SimpleMaze();
	}

	@Override
	public AbstractRoom makeRoom() {
		return new SimpleRoom();
	}

	@Override
	public AbstractWall makeWall() {
		return new SimpleWall();
	}
}
