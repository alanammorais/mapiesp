package builder_exa.model;

public class HondaBuilder extends CarroBuilder{
	
	public HondaBuilder() {
		super();
	}
	
	public void buildPreco() {
		// Operacao complexa. 
		carro.setPreco(50000.00);
	}

	public void buildDscMotor() {
		// Operacao complexa.
		carro.setDscMotor("Eletrico");
	}

	public void buildAnoDeFabricacao() {
		// Operacao complexa.
		carro.setAnoDeFabricacao(2017);
	}

	public void buildModelo() {
		// Operacao complexa.
		carro.setModelo("City");
	}

	public void buildMontadora() {
		// Operacao complexa.
		carro.setMontadora("Honda");
	}
}
