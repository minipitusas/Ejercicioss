package desafios;

import java.util.Scanner;

public class treintacincoEjercicio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int can, min = 10, max = 0, suma = 0, div = 0;
		
		
		for(int i = 1 ; i<=5 ; i++) {
			
			System.out.println("pone la " + i + " calificacion del alumno:");
			can = entrada.nextInt();
		
		 suma += can;
			
		if (can < min ) {
			min = can;
		}
		if (can > max) {
			max = can;
		}
		
		
		
		}
	    
		div = suma / 5;
		System.out.println("La nota mas alta es:" + max);
		System.out.println("La nota mas baja es:" + min);
		System.out.println("El promedio del alumno es: " + div);
		
	}
	
	

}
