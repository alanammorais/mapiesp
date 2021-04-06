package exerAF.modelo;

public class Carro {
	
	private Roda roda;
	private Som som;
	//Suspensao
	
	public Carro(){	}
	
	public Carro(Roda roda, Som som) {
		this.roda = roda;
		this.som = som;
	}

	public Roda getRoda() {
		return roda;
	}
	public void setRoda(Roda roda) {
		this.roda = roda;
	}
	public Som getSom() {
		return som;
	}
	public void setSom(Som som) {
		this.som = som;
	}

	public String toString() {
		return "Carro [roda=" + roda + ", som=" + som + "]";
	}
	
	
	
}
