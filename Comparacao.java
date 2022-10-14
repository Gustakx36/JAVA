import java.util.Locale;
import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double valormais, valortotal;
		double valornormal = 50.0;
		int min;
		
		System.out.println("Qual foi a quantidade de minutos consumidos? ");
		min = sc.nextInt();
		
		if (min > 100) {
			valormais = (min - 100) * 2;
			valortotal = valormais + valornormal;
			System.out.printf("Ira ser cobrado o valor de R$ %.2f de multa, por ter excedido o tempo maximo.%n", valormais);
			System.out.printf("O valor a ser pago total sera de R$ %.2f%n", valortotal);
		} else { 
			System.out.printf("Nao foi excedido o tempo maximo da franquia! Sera cobrado o valor normal de R$ %.2f%n", valornormal);
		}
		
		sc.close();
	}

}
