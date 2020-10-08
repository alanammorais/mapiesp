package visao;
import java.util.Scanner;

import model.AbstractMazeFactory;
import model.EnchantedMazeFactory;
import model.MazeFactory;
import model.elementos.AbstractRoom;

public class MazeGame {
	
	public static void createMaze(AbstractMazeFactory fabrica){
		fabrica.makeDoor();
		fabrica.makeMaze();
		fabrica.makeRoom();
		fabrica.makeWall();		
	}
		
	public static void main(String [] args){
		AbstractMazeFactory abs = null;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o tipo de cenario que deseja criar: ");
		String nome = scn.next();
		
		if (nome.compareTo("encantado") == 0){
			abs = new EnchantedMazeFactory();
			createMaze(abs);
		}
		else if(nome.compareTo("normal") == 0){
			abs = new MazeFactory();
			createMaze(abs);
		}		
		scn.close();
		
		AbstractRoom objeto = abs.getInstance();
		System.out.println(objeto);
		
	
	}

}
