package desafios;

import java.util.Scanner;

public class DEcimoEjercicio {
	public static void main(String[] args) {
        
		   Scanner scanner = new Scanner (System.in);
	        
	        
	        System.out.print("Por favor, ingresa tu nombre: ");
	        String nombre = scanner.nextLine();
	        
	        System.out.print("Ahora, ingresa tu apellido: ");
	        String apellido = scanner.nextLine();
	        
	        System.out.print("Ingrese un número con dos decimales (entre o y 99): ");
	        double numero = scanner.nextDouble();
	        
	        
	        int numeroBingo = (int) (Math.random() * 100);
	        
	        
	        System.out.println("\n¡Hola " + nombre + " " + apellido + "!");
	        System.out.println("El número de bingo que te tocó es: " + numeroBingo);
	        
	        if (numero == numeroBingo) {
	        	System.out.println("GANASTE");
	        	
	        }
	        
	        else {
	        	System.out.println("PERDISTE");
	        }
	        
	        
	  scanner.close();
	    }

}
