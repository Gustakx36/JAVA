package executavel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import Produtos.produtosEstoque;

public class writeAndReader {

	public static void main(String[] args) {

		produtosEstoque pe = new produtosEstoque();
		String caminhoFonte = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\Facul\\Compras\\ValoresEmEstoque.txt";
		String caminhoInsercao = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\Facul\\Compras\\ValoresFinais.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoFonte))) {
			String line = br.readLine();
			while (line != null) {
				String[] produto = line.split(",");
				List<String> produtoEmCaixa = (List<String>) Arrays.asList(produto);
				pe.setProdutos(produtoEmCaixa);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.printf("%nPreços Escaneados : %n");

		for (int i = 0; i < pe.getProdutos().size(); i++) {
			System.out.println(pe.toString(i));

		}

		System.out.printf("%nPreços Inseridos : %n");

		for (int i = 0; i < pe.getProdutos().size(); i++) {
			System.out.println(pe.toStringValores(i));
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoInsercao))) {
			for (int i = 0; i < pe.getProdutos().size(); i++) {
				bw.write(pe.toStringValores(i));
				bw.newLine();
			}
			System.out.printf("%nPreços Inseridos Com Sucesso %n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
