package builder_exa.model;

public abstract class CarroBuilder {
	
	protected CarroProduto carro;

	public CarroBuilder() {
		carro = new CarroProduto();
	}

	public abstract void buildPreco();

	public abstract void buildDscMotor();

	public abstract void buildAnoDeFabricacao();

	public abstract void buildModelo();

	public abstract void buildMontadora();

	public CarroProduto getCarro() {
		return carro;
	}
}
