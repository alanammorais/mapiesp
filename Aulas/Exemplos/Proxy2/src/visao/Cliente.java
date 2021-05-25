package visao;
import model.BancoInterface;
import model.BancoProxy;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Usuario teste: ");
		BancoInterface banco = new BancoProxy("Hacker", "1234");
		System.out.println(banco.getUsuario());
		System.out.println(banco.getSenha());

		System.out.println("\nAdministrador acessando: ");
		banco = new BancoProxy("admin", "admin");
		System.out.println(banco.getUsuario());
		System.out.println(banco.getSenha());
		
	}
}
	