package exerAF;

import model.CdPlayer;
import model.Roda;
import model.RodaSimples;
import model.Som;

public class CarroPopularFactory extends CarroFactory{

	public Roda montarRoda() {
		return new RodaSimples();
	}

	public Som montarSom() {
		return new CdPlayer();
	}

}
