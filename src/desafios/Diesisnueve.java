package desafios;

import java.util.Scanner;

public class Diesisnueve {
     public static void main(String[] args) {
    	        Scanner scanner = new Scanner (System.in);

    	        int opcion;
    	            System.out.println("Ingrese el n�mero correspondiente al tipo de caf�:");
    	            System.out.println("1. Caf� cortado");
    	            System.out.println("2. Caf� Latte");
    	            System.out.println("3. Caf� solo");
    	            System.out.println("4. Caf� l�grima");
    	            System.out.println("5. Salir");

    	            opcion = scanner.nextInt();

    	            switch (opcion) {
    	                case 1:
    	                    System.out.println("El n�mero " + opcion + " es Caf� cortado");
    	                    break;
    	                case 2:
    	                    System.out.println("El n�mero " + opcion + " es Caf� Latte");
    	                    break;
    	                case 3:
    	                    System.out.println("El n�mero " + opcion + " es Caf� solo");
    	                    break;
    	                case 4:
    	                    System.out.println("El n�mero " + opcion + " es Caf� l�grima");
    	                    break;
    	                case 5:
    	                    System.err.println("Saliendo del programa...");
    	                    break;
    	                default:
    	                    System.out.println("Opci�n no v�lida. Por favor, ingrese un n�mero del 1 al 5.");

    	        scanner.close();
    	    }
     }
}


