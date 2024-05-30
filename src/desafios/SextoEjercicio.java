package desafios;

import java.util.Scanner;

public class SextoEjercicio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese tu nota de examen: ");
        double numero = scanner.nextDouble();
        
        int numRedondeado = (int) Math.round(numero);
        
	    System.out.println("El numero redondeado es: "+numRedondeado);        
		
	}

}
