package mayoredad;

import java.util.Scanner;

public class Mayoredad {

	public static void main(String[] args) {
		int edad;
		boolean mayor = false;					//
		Scanner sc = new Scanner(System.in);
		System.out.println("Mi edad es: ");
		edad = sc.nextInt();
		mayor = edad >= 18;
		if (mayor) {
		System.out.println("¡Eres mayor de edad!");
		} else {
		System.out.println("¡Eres menor de edad!");
		
		sc.close();
	}
	}
}
