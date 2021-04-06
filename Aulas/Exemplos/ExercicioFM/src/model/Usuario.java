package model;

public class Usuario {
	
	String nome;

	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String saudacao() {
		return "Olá "+this.nome;
	}

}
