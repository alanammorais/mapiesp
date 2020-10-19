package modelo;

public class ConstrutorPredio extends Construtor{

	private Predio predio = new Predio();
	
	public ConstrutorPredio(Predio predio) {
		this.predio = predio;
	}

	public ConstrutorPredio() {}
	
	public void passoUm() {
		// Informacoes e calculos complexos
		System.out.println("Passo UM Predio");
		predio.setAndares(10);
	}

	public void passoDois() {
		// Informacoes e calculos complexos
		System.out.println("Passo DOIS Predio");
		predio.setPreco(100000);
	}

	public Edificacao obterProduto() {
		return this.predio;
	}

	

}
