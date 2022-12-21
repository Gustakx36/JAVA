package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class writerAndReader {

	public static void main(String[] args) {
		
		String caminho = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\Facul\\12212\\1.txt";
		List<List<String>> listaProdutos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String line = br.readLine();
			while (line != null) {
				String[] Produto = line.split(",");
				List<String> MyList = (List<String>) Arrays.asList(Produto);
				listaProdutos.add(MyList);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(listaProdutos.get(4));
		
	}

}
