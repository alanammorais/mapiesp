package view;

import model.FabricaCitacao;
import model.Nome;

public class Teste {
	
	public static void main(String args[]) {
		
		String lista[] = {
				"Amado Jr., Jorge", 
				"Carla Barbosa Silva",
				"Veloso, Caetano", 
				"Gilberto Gil"};
		
		FabricaCitacao fabrica;
		
		for(int i=0; i<lista.length; i++) {
			fabrica = new FabricaCitacao(lista[i]);
			Nome n = fabrica.getNome();
			System.out.println(n);
		}
			
	}

}
