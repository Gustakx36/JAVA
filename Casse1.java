import java.util.Scanner;

public class Casse1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a data lembre de colocar barra (/) : ");
		String data = sc.next();
		String[] datanormal = data.split("/");
		int datames = Integer.parseInt(datanormal[1]);
		String[]  dataextenso = {"JANEIRO","FEVEREIRO","MARÇO","ABRIL","MAIO","JUNHO","JULHO","AGOSTO","SETEMBRO","OUTUBRO","NOVEMBRO","DEZEMBRO",};

		System.out.println("Hoje é dia " + datanormal[0] + " de " + dataextenso[datames - 1] + " de " + datanormal[2]);
		
	}

}