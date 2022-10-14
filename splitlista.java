import java.util.ArrayList;

public class splitlista {

	public static void main(String[] args) {
		String frase = "nome;teste;10";
		ArrayList<String> lista = new ArrayList<String>();
		
		String[] frase2 = frase.split(";");
		for (String i : frase2) {
			lista.add(i);
		}
		 
		int lista2 = Integer.parseInt(lista.get(2));
		
	    System.out.printf(lista.get(0) + "%n" + lista.get(1) + "%n" + (lista2 + 1));
	}

}

