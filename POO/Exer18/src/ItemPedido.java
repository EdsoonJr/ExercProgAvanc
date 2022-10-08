package Atv18;



public class ItemPedido {
	
	private int quantidade;
	private Produto produto;
	private Pedido contem;

	public Pedido getPedido() {
		return contem;
	}
	public void setPedido(Pedido contem) {
		this.contem = contem;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	

}
