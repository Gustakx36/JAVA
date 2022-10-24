package caixaEletronico;

import java.util.Locale;
import java.util.Scanner;
import caixaEletronicoSistema.sistema;

public class visor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String nomeTitular;

		System.out.print("INSIRA O NUMERO DA CONTA : ");
		int numeroDaConta = sc.nextInt();
		System.out.print("INSIRA O NOME DO TITULAR : ");
		nomeTitular = sc1.nextLine();

		sistema sistema = new sistema(numeroDaConta, nomeTitular);

		System.out.println(sistema.informacoes());

		System.out.printf("HAVERA UM DEPOSITO INICIAL (s/n) : ");
		String SorY = sc.next();
		int value = 0;
		
		if (SorY.equals("s") || SorY.equals("S")) {
			System.out.print("DIGITE O VALOR DO DEPOSITO : ");
			double valorDeposito = sc.nextDouble();
			sistema.setValorEmConta(valorDeposito);
			value = 1;

		} else if (SorY.equals("n") || SorY.equals("N")) {
			System.out.print("TEM CERTEZA QUE NAO FARA UM DEPOSITO INICIAL (s/n) : ");
			String certeza = sc.next();

			if (certeza.equals("n") || certeza.equals("N")) {
				System.out.print("PODEMOS CONTINUAR (s/n) : ");
				certeza = sc.next();
				if (certeza.equals("s") || certeza.equals("s")) {
					System.out.print("DIGITE O VALOR DO DEPOSITO : ");
					double valorDeposito = sc.nextDouble();
					sistema.setValorEmConta(valorDeposito);
					value = 1;
					
				} else {
					System.out.println("E POSSIVEL CONTINUAR APENAS COM UM DEPOSITO INICIAL.");
					value = 0;
				}

			} else {
				System.out.println("E POSSIVEL CONTINUAR APENAS COM UM DEPOSITO INICIAL");
				System.out.printf("%nTENTE NOVAMENTE MAIS TARDE.%n");
				value = 0;
			}
		}

		System.out.printf("%n(INFORMACOES INSERIDAS) %s%n", sistema.informacoes());

		if (value == 1) {
			int escolha = 0;			
			
			while (escolha != (3)) {
				
				System.out.print(sistema.escolha());
				escolha = sc.nextInt();
				if (escolha == 1) {
					System.out.printf("%nDIGITE O VALOR DO DEPOSITO : ");
					double valorDeposito = sc.nextDouble();
					sistema.setValorEmConta(valorDeposito);
					System.out.printf("%n(ATUALIZADO) %s%n",sistema.informacoes());
					
				} else if (escolha == 2) {
					if (sistema.getValorEmConta() > 0) {
						System.out.print(sistema.saque());
						int escolhasaque = sc.nextInt();
						if (escolhasaque <= 50000) {
						sistema.saque(escolhasaque);
						System.out.printf("%n(ATUALIZADO) %s%n" 
								+ "OBRIGADO VOLTE SEMPRE ", sistema.informacoes());
						
						} else {
							System.out.printf("VALOR ACIMA DO PERMITIDO DIARIAMENTE%n"
									+ "TENTE NOVAMENTE%n");
						}
					} else {
						System.out.printf("VALOR INSUFICIENTE, DEPOSITE UM VALOR%n%n" 
								+ "OBRIGADO VOLTE SEMPRE");
					}

				} else if (escolha == 3) {
					System.out.println("OBRIGADO VOLTE SEMPRE");
				}
			}
		} 

		sc.close();
		sc1.close();

	}

}
