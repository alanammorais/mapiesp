package main;

import modelo.Casa;
import modelo.ConstrutorCasa;
import modelo.ConstrutorPredio;
import modelo.Diretor;
import modelo.Predio;

public class Cliente {
	
	public static void main(String[] args){
		
		//Não Obrigatório
		ConstrutorPredio cP = new ConstrutorPredio();
		ConstrutorCasa cC = new ConstrutorCasa();
		
		Diretor d = new Diretor(cP);
				
		//Predio
		d.construir();
		System.out.println(cP.obterProduto()); //unico tipo de acesso p Construtor
		
		//Casa
		Diretor d2 = new Diretor(cC);
		d2.construir();
		System.out.println(cC.obterProduto());
	}

}
