package modelo;

public class PedidoBuilder extends PedidoAbstrato{
	
	public PedidoBuilder() {
		this.setPedido(new Pedido());
	}

	@Override
	public void montarDentroCaixa(String sanduiche, String batata, String brinquedo) {
		this.getPedido().adicionarDentroDaCaixa(sanduiche);
		this.getPedido().adicionarDentroDaCaixa(batata);
		this.getPedido().adicionarDentroDaCaixa(brinquedo);
	}

	@Override
	public void montarForaCaixa(String refrigerante) {
		this.getPedido().adicionarForaDaCaixa(refrigerante);		
	}

}
