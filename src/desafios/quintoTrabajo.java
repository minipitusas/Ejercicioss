package desafios;

import java.util.Scanner;

public class quintoTrabajo {
	    public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
	        
	        System.out.print("Ingrese un n�mero: ");
	        double numero = scanner.nextDouble();
	        
	        double raizCuadrada = Math.sqrt(numero);
	        
	        System.out.println("La ra�z cuadrada de " + numero + " es: " + raizCuadrada);
	        
	        scanner.close();
	    }
	}

