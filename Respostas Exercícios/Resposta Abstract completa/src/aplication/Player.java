package aplication;

import javax.swing.JOptionPane;

import factories.AbstractFactoryMaze;
import factories.EnchantedFactoryMaze;
import factories.FactoryMaze;

public class Player {

	private static MazeGame createMaze(String type) {
        MazeGame game = null;
		AbstractFactoryMaze factory = null;
        if (type.equalsIgnoreCase("Encantado")) {
            factory = new EnchantedFactoryMaze();
            game = new MazeGame(factory);
        } else {
        	factory = new FactoryMaze();
            game = new MazeGame(factory);
        }
        return game;
    }
	
	public static void main(String[] args) {
		String []  jogo = {"Encantado", "Simples"};
		
		String input = (String) JOptionPane.showInputDialog(null, "Selecione seu tipo de jogo","Modo de jogo", JOptionPane.QUESTION_MESSAGE, null, jogo, jogo[0]);
		
		MazeGame game = createMaze(input);
		game.create();

	}
}
