package modelo;

public class Edificacao {
	
	private String endereco;
	private double preco;
	
	public Edificacao(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}
	
	public Edificacao() {}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "Edificacao [endereco=" + endereco + ", preco=" + preco + "]";
	}
	
	
	

}
