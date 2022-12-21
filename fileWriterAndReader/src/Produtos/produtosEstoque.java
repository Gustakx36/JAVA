package Produtos;

import java.util.ArrayList;
import java.util.List;

public class produtosEstoque {

	List<List<String>> produtos = new ArrayList<>();
	
	public produtosEstoque() {
	}

	public List<List<String>> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<String> produtos) {
		this.produtos.add(produtos);
	}
	
	public String getProduto(Integer id) {
		List<String> caixa = produtos.get(id);
		String produto = caixa.get(0);
		return produto;
	}
	
	public Double getPreco(Integer id) {
		List<String> caixa = produtos.get(id);
		Double preco = Double.parseDouble(caixa.get(1));
		return preco;
	}
	
	public Integer getQuantidade(Integer id) {
		List<String> caixa = produtos.get(id);
		Integer quantidade = Integer.parseInt(caixa.get(2));
		return quantidade;
	}
	
	public Double getValorEmQuantidade(Integer id) {
		return getPreco(id) * getQuantidade(id);
	}
	
	public String toString(Integer id) {
		StringBuilder sr = new StringBuilder();
		sr.append(getProduto(id) + "," + " R$ " +  getPreco(id) + 
				" - " +  getQuantidade(id));
		return sr.toString();
	}
	
	public String toStringValores(Integer id) {
		StringBuilder sr = new StringBuilder();
		sr.append(getProduto(id) + "," + " R$ " + getValorEmQuantidade(id));
		return sr.toString();
	}
	
}
