package Negativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE UM VALOR ENTRE 1 E 10 : ");
		int n = sc.nextInt();
		int[] negativos = new int[n];
		String[] posicao = new String[10];
		
		posicao[0] = "PRIMEIRO";posicao[1] = "SEGUNDO";posicao[2] = "TERCEIRO";
		posicao[3] = "QUARTO";posicao[4] = "QUINTO";posicao[5] = "SEXTO";
		posicao[6] = "SETIMO";posicao[7] = "OITAVO";posicao[8] = "NONO";
		posicao[9] = "DECIMO";
		
		for (int i=0; i<negativos.length; i++) {
			System.out.printf("%nDIGITE O %s VALOR : ", posicao[i]);
			negativos[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS");
		
		for (int i=0; i<negativos.length; i++) {
			if (negativos[i] < 0) {
				System.out.printf("%s : %d%n", posicao[i], negativos[i]);
			}
		}
		
		sc.close();

	}

}
