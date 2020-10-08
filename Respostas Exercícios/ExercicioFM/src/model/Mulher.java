package model;

public class Mulher extends Usuario{
	
	public Mulher(String nome) {
		super(nome);
	}
	
	public String saudacao() {
		return "Olá Sra. " + getNome();
	}

}
