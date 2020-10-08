package model;

public class Homem extends Usuario{
	

	public Homem(String nome) {
		super(nome);
	}

	public String saudacao() {
		return "Olá Sr. "+ getNome();
	}

}
