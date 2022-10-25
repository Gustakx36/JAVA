package Calculo;

import java.util.Locale;
import java.util.Scanner;
import Pessoa.Informacao;

public class Alturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("QUANTAS PESSOA SERAO DIGITADAS? : ");
		int n = sc.nextInt();
		Informacao[] info = new Informacao[n];
		double alturaSoma = 0;
		double somaIdade = 0;
		
		for(int i=0; i<info.length; i++) {
			System.out.printf("%nDIGITE OS DADOS DA %da PESSOA: %n", i+1);
			System.out.print("NOME : ");
			String nome = sc.next();
			System.out.printf("IDADE : ");
			int idade = sc.nextInt();
			System.out.printf("ALTURA : ");
			String altura = sc.next();
			info[i] = new Informacao(nome, idade, altura);
			alturaSoma += info[i].getAltura(); 
			if (info[i].getIdade() < 16) {
				somaIdade += 1;
			}
		}
		
		System.out.printf("%nALTURA MEDIA : %.2fm%n", alturaSoma / info.length);
		
		System.out.printf("PESSOAS COM MENOS DE 16 ANOS : %.2f%% %n", somaIdade * 100 / info.length);
		
		for(int i=0; i<info.length; i++) {
			if (info[i].getIdade() < 16) {
				System.out.printf("%s%n", info[i].getNome());
			}	
		}
		
		
		
		sc.close();
	}

}
