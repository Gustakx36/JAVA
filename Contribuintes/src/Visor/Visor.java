package Visor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.pessoFisica;
import entidades.pessoaJuridica;

public class Visor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Pessoa> lista = new ArrayList<>();
		String str1, str2, strExterno = "";
		Double soma = 0.0;
		
		
		System.out.print("QUANTOS CONTRIBUINTES SERAO INSERIDOS : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("%n%d# CONTRIBUINTE : ", i + 1);
			System.out.printf("%nESSE " + strExterno + " CONTRIBUINTE E PESSOA FISICA OU JURIDICA (F/J) ? ");
			char fc = sc.next().charAt(0);
			strExterno = "OUTRO";
			if (fc == 'f') {
				str1 = "E CONTRIBUINTE";
				str2 = "QUAL O GASTO DESSE CONTRIBUINTE COM SAUDE : "; 
			} else {
				str1 = "A EMPRESA";
				str2 = "QUANTOS FUNCIONARIOS ESSA EMPRESA POSSUI : "; 
			}
			System.out.printf("QUAL O NOME DESS%s : ", str1);
			String nome = sc.next();
			System.out.printf("QUAL A RENDA ANUAL DESS%s : ", str1);
			Double rendaAnual = sc.nextDouble();
			System.out.printf("%s", str2);
			if (fc == 'F' || fc == 'f') {
				Double gastosComSaude = sc.nextDouble();
				lista.add(new pessoFisica(nome, rendaAnual, gastosComSaude));
			} else {
				Double numeroDeFuncionarios = sc.nextDouble();
				lista.add(new pessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
			}
		}
		System.out.printf("%nIMPOSTO(OS) : %n");
		for (Pessoa pessoa : lista) {
			System.out.printf("%s : R$ %.2f %n", pessoa.getNome(), pessoa.imposto());
			soma += pessoa.imposto();
		}
		
		System.out.printf("%nTOTAL DE TAXAS : R$ %.2f", soma);
		sc.close();
		
	}

}
