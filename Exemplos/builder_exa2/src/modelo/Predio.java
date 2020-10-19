package modelo;

public class Predio extends Edificacao {
	
	private int andares;
	
	public Predio() {
		super();
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	@Override
	public String toString() {
		return "Predio [andares=" + andares + ", getEndereco()=" + getEndereco() + ", getPreco()=" + getPreco() + "]";
	}
	
	
	
}
