package aplication;

import factories.AbstractFactoryMaze;
import interfaces.AbstractDoor;
import interfaces.AbstractMaze;
import interfaces.AbstractRoom;
import interfaces.AbstractWall;

public class MazeGame {
	private AbstractDoor door;
	private AbstractMaze maze;
	private AbstractRoom room;
	private AbstractWall wall;

	public MazeGame(AbstractFactoryMaze factory) {
		door = factory.makeDoor();
		maze = factory.makeMaze();
		room = factory.makeRoom();
		wall = factory.makeWall();
	}

	public void create() {
		door.create();
		maze.create();
		room.create();
		wall.create();
	}

}
