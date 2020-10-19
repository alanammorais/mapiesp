package modelo;

public class Diretor {
	
	private Construtor constr;

	public Diretor(Construtor constr) {
		this.constr = constr;
	}

	public void construir(){
		this.constr.passoUm();
		this.constr.passoDois();
	}

	public Construtor getConstr() {
		return constr;
	}

	public void setConstr(Construtor constr) {
		this.constr = constr;
	}
	
	
	
}
