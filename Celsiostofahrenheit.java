import java.util.Scanner;

public class Celsiostofahrenheit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		char R;

		do{
			System.out.print("DIGITE O VALOR EM CELCIOS : ");
			C = sc.nextInt();
			F = ((9 * C) / 5) + 32;
			System.out.printf("EQUIVALENTE EM FAHRENHEIT : %.2f%n", F);
			System.out.print("DESEJA CONTINUAR (s/n)? ");
			R = sc.next().charAt(0);
		} while(R == 's');
		
		sc.close();

	}

}
