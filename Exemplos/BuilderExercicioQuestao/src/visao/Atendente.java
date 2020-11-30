package visao;

import controlador.MontadorPedido;
import modelo.Pedido;

public class Atendente {
	
	public static void main(String[] args) {
		
		MontadorPedido montador = new MontadorPedido();
		Pedido pedidoPronto = montador.montar("hambúrguer", "pequena", "carrinho", "coca");
		System.out.println(pedidoPronto);
		
		Pedido pedidoPronto2 = montador.montar("cheeseburger", "média", "carrinho", "coca");
		System.out.println(pedidoPronto2);
	}
	
	
}
