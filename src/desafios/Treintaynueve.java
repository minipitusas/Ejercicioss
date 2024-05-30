package desafios;


import java.util.Scanner;

public class Treintaynueve {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String[] nombre = new String [11];
		int [] edad = new int [11];
		
		for (int i = 0; i <11; i++ ) {
		
		
		
		
		System.out.println("Ingrese el nombre ddel jugador: " );
		nombre [i]= entrada.next();
		System.out.println("Ingrese la edad del jugador: " );
		edad [i ]= entrada.nextInt(); 
		
		
		}
		System.out.println("Los nombres de los jugadores son:");
		for (int i = 0; i <11; i++ ) {
		System.out.println("Nombre del jugador: " + nombre [i]);
		System.out.println("edad del jugador: " + edad [i]);
		
		}


	}
}

	


