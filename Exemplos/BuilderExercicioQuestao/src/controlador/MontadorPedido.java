package controlador;

import modelo.Pedido;
import modelo.PedidoBuilder;

public class MontadorPedido {
	
	private PedidoBuilder pedidoSolicitado;
	
	public MontadorPedido() {
		pedidoSolicitado = new PedidoBuilder();
	}

	public Pedido montar(String sanduiche, String batata, String brinquedo, String refrigerante) {
		pedidoSolicitado.montarDentroCaixa(sanduiche, batata, brinquedo);
		pedidoSolicitado.montarForaCaixa(refrigerante);
		return pedidoSolicitado.getPedido();
	}
}
