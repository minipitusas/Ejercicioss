package desafios;

import java.util.Scanner;

public class Diesciseisejercicio {
	
	public static void main(String[] args) {
		    Scanner scanner = new Scanner (System.in);
		

	        System.out.println("Ingrese el primer n�mero:");
	        double num1 = scanner.nextDouble();

	        System.out.println("Ingrese el segundo n�mero:");
	        double num2 = scanner.nextDouble();

	        System.out.println("Ingrese el tercer n�mero:");
	        double num3 = scanner.nextDouble();

	       
	        double mayor = num1;
	        if (num2 > mayor) {
	            mayor = num2;
	        }
	        if (num3 > mayor) {
	            mayor = num3;
	        }

	       
	        double menor = num1;
	        if (num2 < menor) {
	            menor = num2;
	        }
	        if (num3 < menor) {
	            menor = num3;
	        }

	        
	        double segundoMayor;
	        if (num1 == mayor) {
	            segundoMayor = Math.max(num2, num3);
	        } else if (num2 == mayor) {
	            segundoMayor = Math.max(num1, num3);
	        } else {
	            segundoMayor = Math.max(num1, num2);
	        }

	        System.out.println("El mayor n�mero es: " + mayor);
	        System.out.println("El segundo mayor n�mero es: " + segundoMayor);
	        System.out.println("El menor n�mero es: " + menor);

	        scanner.close();
	    }

	}

