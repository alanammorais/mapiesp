package modelo;

public class ConstrutorCasa extends Construtor{
	
	private Casa casa = new Casa();
	
	public ConstrutorCasa(Casa casa) {
		this.casa = casa;
	}
	
	public ConstrutorCasa() {}

	public void passoUm() {
		// Informacoes e calculos complexos
		System.out.println("Passo UM Casa");
		casa.setM2(10000);
	}

	public void passoDois() {
		// Informacoes e calculos complexos
		System.out.println("Passo DOIS Casa");
		casa.setPreco(5000000);
		
	}

	public Edificacao obterProduto() {
		return this.casa;
	}


}
