package model;
 
public class BancoUsuarios extends BancoInterface{
	private String usuario;
	private String senha;

	public BancoUsuarios() {
	}
	
	public BancoUsuarios(String u, String s) {
		this.usuario = u;
		this.senha = s;
	}

	public String getUsuario() {
		return new String("Usuario: " + this.usuario);
	}

	public String getSenha() {
		return new String("Senha: " + this.senha);
	}
}
