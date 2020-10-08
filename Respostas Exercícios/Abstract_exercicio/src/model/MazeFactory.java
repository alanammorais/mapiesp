package model;

import model.elementos.Room;

public class MazeFactory extends AbstractMazeFactory{
	
	public MazeFactory() {}
	
	public Room getInstance(){
		return new Room();
	}

	public void makeMaze() {
		System.out.println("Constroi labirinto");
		
	}

	public void makeWall() {
		System.out.println("Constroi muro");
		
	}

	public void makeRoom() {
		System.out.println("Constroi quarto");
		
	}

	public void makeDoor() {
		System.out.println("Constroi porta");	
	}
	
}
