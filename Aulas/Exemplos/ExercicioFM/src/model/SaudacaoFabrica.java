package model;

public class SaudacaoFabrica extends AbstractSaudacaoFabrica{
	
	String genero = "-";
	
	public SaudacaoFabrica(String g) {
		this.genero = g;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Usuario getUsuario(String nome) {
		if (this.genero.equals("m"))
			return new Homem(nome);
		else if(this.genero.contentEquals("f"))
			return new Mulher(nome);
		else
			return new Usuario(nome);
	}
	
	
	

}
