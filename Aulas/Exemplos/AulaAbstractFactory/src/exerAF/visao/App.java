package exerAF.visao;

import exerAF.modelo.Carro;
import exerAF.modelo.CarroFactory;
import exerAF.modelo.CarroLuxoFactory;
import exerAF.modelo.CarroPopularFactory;

public class App {
	
	private static Carro montarCarro(String tipo){
		CarroFactory cf = null;
		if (tipo.compareTo("luxo") == 0)
			cf = new CarroLuxoFactory();
		
		else if (tipo.compareTo("popular") == 0) 
			cf = new CarroPopularFactory();
	
		/*
		Carro c = new Carro();
		c.setRoda(cf.montarRoda());
		c.setSom(cf.montarSom());
		 */
		
		Carro c = cf.getCarro();
		
		return c;
	}

	
	public static void main(String[] args){
		Carro c1 = montarCarro("luxo");
		Carro c2 = montarCarro("popular");	
	}

}
