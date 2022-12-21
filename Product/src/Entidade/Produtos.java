package Entidade;

public class Produtos {
	
	private String nome;
	private  double preco;
	private  int quantidade;
	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return String.format("%s, custando R$ %.2f cada,%n"
				+ "com %d  em estoque, totalizando o valor de R$ %.2f"
				+ "%n", nome, preco, quantidade, valorTotalEmEstoque());
	}
}
