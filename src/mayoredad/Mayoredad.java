package mayoredad;

import java.util.Scanner;

public class Mayoredad {

	public static void main(String[] args) {
		int edad;								//Variable que almacena la edad introducida posteriormente
		boolean mayor = false;					//Variable que comprueba si la edad es mayor
		Scanner sc = new Scanner(System.in);	//Lee lo que introduzcamos
		System.out.println("Mi edad es: ");		//Nos indica que escribamos la edad
		edad = sc.nextInt();					//Lee la edad introducida y la guarda en su variable
		mayor = edad >= 18;						//Compara la edad introducida para saber si es mayor o igual a 18
		if (mayor) {										/*Colocamos un if para si es mayor de 18 o igual poner que es mayor
															o sino ( else ) para decir que es menor de edad*/
		System.out.println("¡Eres mayor de edad!");
		} else {
		System.out.println("¡Eres menor de edad!");
		
		sc.close();			//Cerramos escáner
	}
	}
}

