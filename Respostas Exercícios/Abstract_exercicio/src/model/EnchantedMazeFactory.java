package model;

import model.elementos.EnchantedRoom;

public class EnchantedMazeFactory extends AbstractMazeFactory{
	
	public EnchantedMazeFactory() {}
	
	public EnchantedRoom getInstance(){
		return new EnchantedRoom();
	}

	public void makeMaze() {
		System.out.println("Constroi labirinto encantado");		
	}

	public void makeWall() {
		System.out.println("Constroi muro encantado");
		
	}

	public void makeRoom() {
		System.out.println("Constroi quarto encantado");
		
	}

	public void makeDoor() {
		System.out.println("Constroi porta encantado");
	}
	
	
}
