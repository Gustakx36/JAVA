package Tela;

import java.util.Scanner;
import controleRemoto.Controle;

public class Tela {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controle botao = new Controle();

		while (botao.ligar != 1) {
			while (botao.ligar != 1) {
				System.out.println("Para ligar a tv digite (1)");
				botao.ligar = sc.nextInt();
				botao.tarefa = 1;
			}

			while (botao.tarefa != 0) {
				System.out.println(botao.ligado(botao.ligar));
				botao.tarefa = sc.nextInt();

				if (botao.tarefa == 1) {
					System.out.println("Voce quer aumentar (1), diminuir (2) o volume ou voltar ao inicio (3) ? ");
					botao.volume = sc.nextInt();
					System.out.println(botao.volumeresult());

					while (botao.volume != 3) {
						botao.volume = sc.nextInt();
						System.out.println(botao.volumeresult());
					}
				} else if (botao.tarefa == 2) {
					System.out.println("Voce quer avancar (1), retroceder (2) o canal ou voltar ao inicio (3) ? ");
					botao.canal = sc.nextInt();
					System.out.println(botao.canalresult());

					while (botao.canal != 3) {
						botao.canal = sc.nextInt();
						System.out.println(botao.canalresult());
					}
				} else if (botao.tarefa == 3) {
					int x = 1;
					while (x > 0) {
						System.out.println("Qual canal quer selecionar ? ");
						botao.canal = sc.nextInt();
						System.out.printf("canal escolhido foi %d%n%n", botao.canal);
						System.out.println("Quer escolher o canal novamente sim (1) ou nao (0) ? ");
						x = sc.nextInt();
					}
					System.out.printf("Voce reiniciou%n%n");
				} else if (botao.tarefa == 4) {
					int x = 0;
					while (x == 0) {
						System.out.printf("Voce esta no canal (%d) e com o volume no (%d)%n%n", 
						botao.getCanalnum(), botao.getVolumenum());
						System.out.printf("Deseja voltar ao inicio sim (1) ou nao (2) ?%n%n");
						x = sc.nextInt();
					}
					System.out.print("Voce reiniciou%n%n");
				}
			}
		}
		sc.close();
	}

}
