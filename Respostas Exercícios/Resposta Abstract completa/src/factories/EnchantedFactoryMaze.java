package factories;

import enchanted.EnchantedDoor;
import enchanted.EnchantedMaze;
import enchanted.EnchantedRoom;
import enchanted.EnchantedWall;
import interfaces.AbstractDoor;
import interfaces.AbstractMaze;
import interfaces.AbstractRoom;
import interfaces.AbstractWall;

public class EnchantedFactoryMaze extends AbstractFactoryMaze {
	
	@Override
	public AbstractDoor makeDoor() {
		return new EnchantedDoor();
		
	}

	@Override
	public AbstractMaze makeMaze() {
		return new EnchantedMaze();
	}

	@Override
	public AbstractRoom makeRoom() {
		return new EnchantedRoom();
	}

	@Override
	public AbstractWall makeWall() {
		return new EnchantedWall();
	}
	
	
}
