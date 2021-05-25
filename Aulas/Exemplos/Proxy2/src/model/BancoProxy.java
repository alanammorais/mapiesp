package model;
public class BancoProxy extends BancoInterface {

	private String usuario, senha;
	private BancoUsuarios bancoU; //composicao

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		bancoU = new BancoUsuarios(usuario, senha);
	}

	@Override
	public String getUsuario() {
		if (temPermissaoDeAcesso()) {
			return bancoU.getUsuario();
		}
		return "usuario incorreto";
	}

	@Override
	public String getSenha() {
		if (temPermissaoDeAcesso()) {
			return bancoU.getSenha();
		}
		return "senha incorreta";
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
