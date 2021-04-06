package exerAF.modelo;

public class CarroLuxoFactory extends CarroFactory{
	
	public CarroLuxoFactory() {}

	public Roda montarRoda() {
		Roda rc = new RodaLigaLeve();
		return rc;
	}

	public Som montarSom() {
		return new Paredao();
	}

	
	public Carro getCarro() {
		return new Carro(new RodaLigaLeve(), new Paredao());
	}


}
