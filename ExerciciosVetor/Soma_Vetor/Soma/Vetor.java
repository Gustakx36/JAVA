package Soma;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTOS NUMEROS SERAO DIGITADOS? : ");
		int n = sc.nextInt();
		double soma = 0.0;
		double[] somavet = new double[n];
		
		for (int i=0; i<somavet.length; i++) {
			System.out.print("DIGITE UM NUMERO : ");
			somavet[i] = sc.nextDouble();
		}
		
		System.out.printf("%nVALORES : ");
		
		for (int i=0; i<somavet.length; i++) {
			System.out.printf(" %.2f ", somavet[i]);
			soma += somavet[i];
		}

		System.out.printf("%nSOMA : %.2f", soma);
		System.out.printf("%nMEDIA : %.2f", soma / somavet.length);
		
		sc.close();
		
	}

}
