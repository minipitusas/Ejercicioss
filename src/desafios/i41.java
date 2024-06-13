package desafios;

import java.util.Scanner;

public class i41 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String [] nombre = new String [5];
		int []edad = new int [5];
		
		for (int jugadores = 0; jugadores <5; jugadores++ ) {
		
		
		System.err.println("Cuál es el nombre del jugador?");
		
		System.out.println("Ingrese el nombre: " );
		nombre [jugadores] = entrada.next();
		System.out.println("Ingrese la edad: " );
		edad [jugadores] = entrada.nextInt(); }
		
		System.out.println("Los nombres de los jugadores son estos:");
		for(String nombre11: nombre ) {
			
			System.out.println(nombre11 );
			
		}
		System.out.println("Las edades de los jugadores son:");
		for(int edad11: edad) {
			
			System.out.println(edad11 );
		}
		
	}

}
