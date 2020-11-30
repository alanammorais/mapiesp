package modelo;

public abstract class PedidoAbstrato {
	
	private Pedido pedido;
	
	public abstract void montarDentroCaixa(String sanduiche, String batata, String brinquedo);
	
	public abstract void montarForaCaixa(String refrigerante);
	

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	
	//1. O sanduíche (hambúrguer ou cheeseburger), a batata (pequena, média ou grande) 
	//e o brinquedo (carrinho ou bonequinha) são colocados dentro de uma caixa
	
	//2. O refrigerante (coca ou guaraná) é entregue fora da caixa
	

}
