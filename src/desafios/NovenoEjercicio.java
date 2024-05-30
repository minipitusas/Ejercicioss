package desafios;

import java.util.Scanner;

public class NovenoEjercicio {
public static void main(String[] args) {
        
	   Scanner scanner = new Scanner (System.in);
        
        
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ahora, ingresa tu apellido: ");
        String apellido = scanner.nextLine();
        
        
        int numeroBingo = (int) (Math.random() * 100);
        
        
        System.out.println("\n¡Hola " + nombre + " " + apellido + "!");
        System.out.println("El número de bingo que te tocó es: " + numeroBingo);
        
        
  scanner.close();
    }


}
