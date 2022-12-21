package Product;

import java.util.Locale;
import java.util.Scanner;
import Entidade.Produtos;

public class Product {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as infirmacoes do produto - ");
		System.out.print("Nome : ");
		String nome = sc.next();
		System.out.print("Preco : ");
		double preco = sc.nextDouble();
		Produtos produto = new Produtos(nome, preco);
		
		System.out.printf("%nInsira um novo nome : ");
		nome = sc.next();
		
		produto.setNome(nome);
		System.out.printf("Atualizado : %S%n%n", produto.getNome());
		System.out.printf("Informacoes : %S", produto);
		
		System.out.printf("%nAdicione uma quantidade de produtos : ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		System.out.printf("Informacoes atualizadas : %S", produto);
		
		System.out.printf("%nRemova uma quantidade de produtos : ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		System.out.printf("Informacoes atualizadas : %S", produto);
		
		sc.close();
		
	}
}
