package builder_exa.model;

public class CarroProduto {
	
	private double preco;
	private String dscMotor;
	private int anoDeFabricacao;
	private String modelo;
	private String montadora;
	
	public CarroProduto(double preco, String dscMotor, int anoDeFabricacao, String modelo, String montadora) {
		super();
		this.preco = preco;
		this.dscMotor = dscMotor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.modelo = modelo;
		this.montadora = montadora;
	}
	
	public CarroProduto() {}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDscMotor() {
		return dscMotor;
	}

	public void setDscMotor(String dscMotor) {
		this.dscMotor = dscMotor;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	
	
	

}
