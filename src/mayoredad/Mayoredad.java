package mayoredad;

import java.util.Scanner;

public class Mayoredad {

	public static void main(String[] args) {
		int edad;								//Variable que almacena la edad introducida posteriormente
		boolean mayor;					//Variable que comprueba si la edad es mayor
		Scanner sc = new Scanner(System.in);	//Lee lo que introduzcamos
		System.out.println("Mi edad es: ");		//Nos indica que escribamos la edad
		edad = sc.nextInt();					//Lee la edad introducida y la guarda en su variable
		mayor = edad >= 18;						//Compara la edad introducida para saber si es mayor o igual a 18
										
		System.out.println("¿Eres mayor de edad? " + mayor); //Nos indica si somos mayores o no, gracias al boolean, true o false
		
		sc.close();			//Cerramos escáner
	}
	}


