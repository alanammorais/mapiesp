package exerAF.modelo;

public abstract class CarroFactory {
	
	public CarroFactory() {}
	
	public abstract Roda montarRoda();
	
	public abstract Som montarSom();
		
	public abstract Carro getCarro();
	
}
