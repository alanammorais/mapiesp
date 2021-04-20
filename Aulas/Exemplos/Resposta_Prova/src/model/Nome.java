package model;

public class Nome {
	
	private String primeiroNome;
	private String sobrenome;
	
	public Nome(String primeiroNome, String sobrenome) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
	}

	public Nome() {
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String toString() {
		return this.primeiroNome + " " + this.sobrenome;
	}
	
	

	
}
