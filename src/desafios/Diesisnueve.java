package desafios;

import java.util.Scanner;

public class Diesisnueve {
     public static void main(String[] args) {
    	        Scanner scanner = new Scanner (System.in);

    	        int opcion;
    	            System.out.println("Ingrese el número correspondiente al tipo de café:");
    	            System.out.println("1. Café cortado");
    	            System.out.println("2. Café Latte");
    	            System.out.println("3. Café solo");
    	            System.out.println("4. Café lágrima");
    	            System.out.println("5. Salir");

    	            opcion = scanner.nextInt();

    	            switch (opcion) {
    	                case 1:
    	                    System.out.println("El número " + opcion + " es Café cortado");
    	                    break;
    	                case 2:
    	                    System.out.println("El número " + opcion + " es Café Latte");
    	                    break;
    	                case 3:
    	                    System.out.println("El número " + opcion + " es Café solo");
    	                    break;
    	                case 4:
    	                    System.out.println("El número " + opcion + " es Café lágrima");
    	                    break;
    	                case 5:
    	                    System.err.println("Saliendo del programa...");
    	                    break;
    	                default:
    	                    System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 5.");

    	        scanner.close();
    	    }
     }
}


