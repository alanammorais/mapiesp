package exerAF;

import model.Paredao;
import model.Roda;
import model.RodaLigaLeve;
import model.Som;

public class CarroLuxoFactory extends CarroFactory{

	public Roda montarRoda() {
		return new RodaLigaLeve();
	}

	public Som montarSom() {
		return new Paredao();
	}

}
