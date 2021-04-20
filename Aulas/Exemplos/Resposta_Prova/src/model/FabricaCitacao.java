package model;

public class FabricaCitacao extends AbstractFabricaCitacao{

	public String entrada;
	
	public FabricaCitacao(String entrada) {
		this.entrada = entrada;
	}
	
	public Nome getNome() {
		if (this.entrada.contains(","))
			return new NomeCitacaoIndireta(entrada);
		else 
			return new NomeCitacaoDireta(entrada);
	}

}
