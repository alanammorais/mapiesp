package exerAF.modelo;

public class CarroPopularFactory extends CarroFactory{
	
	public CarroPopularFactory() {}

	public Roda montarRoda() {
		return new RodaSimples();
	}

	public Som montarSom() {
		return new CdPlayer();
	}
	
	public Carro getCarro() {
		return new Carro(new RodaSimples(), new CdPlayer());
	}

}
