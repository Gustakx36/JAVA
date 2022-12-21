import java.util.Locale;
import java.util.Scanner;

import Entidades.Triangulos;

public class Triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulos x, y;
		x = new Triangulos();
		y = new Triangulos();
		
		System.out.println("Quais as medidas do triangulo (X) : ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Quais as medidas do triangulo (Y) : ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.println("Area do triangulo (X) : " + areaX);
		System.out.println("Area do triangulo (Y) : " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Area do triangulo (X) é a maior"); 
		} 
		else if (areaX == areaY) {
			System.out.println("Area do triangulo (X) e (Y) são iguais");
		}
		else {
			System.out.println("Area do triangulo (Y) é a maior");
		}
			
			
		sc.close();
	}

}
