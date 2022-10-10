import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Numero_aleatorio {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		System.out.println("Vamos Gerar 100 Numeros Aleatorios e Ordenar Eles");
		ArrayList<Integer> numerosordenados = new ArrayList<Integer>(); 
		ArrayList<Integer> numerosrepetidos = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			
			numerosordenados.add(gerador.nextInt(101));
			
		}
		Collections.sort(numerosordenados);
		System.out.println("A Lista em Ordem Crescente : " + numerosordenados);
		Collections.reverse(numerosordenados);
		System.out.println("A Lista em Ordem Decrescente : " + numerosordenados);
		System.out.println("O Maior Numero : " + numerosordenados.get(0));
		System.out.println("O Menor Numero : " + numerosordenados.get(99));
		Collections.sort(numerosordenados);
		
		for (int i = 0; i < numerosordenados.size() - 1; i++) {
			if (numerosordenados.get(i) == numerosordenados.get(i + 1))
				numerosrepetidos.add(numerosordenados.get(i));
			else
				continue;
		}
		for (int i = 0; i < numerosrepetidos.size() - 1; i++) {
		for (int i1 = 0; i1 < numerosrepetidos.size() - 1; i1++) {
			if (numerosrepetidos.get(i1) == numerosrepetidos.get(i1 + 1))
				numerosrepetidos.remove(i1);
			else
				continue;		
		}
	}
		System.out.println("Numeros Que se Repetiram : " + numerosrepetidos);
	}

}
