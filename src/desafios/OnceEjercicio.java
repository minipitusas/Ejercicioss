package desafios;

import java.util.Scanner;

public class OnceEjercicio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
        System.out.print("Ingrese un número con dos decimales: ");
        double numero = scanner.nextDouble();	
        
        if (numero > 0) {
        System.out.println("positivo");
        } else if (numero < 0) {
        System.out.println("negativo");
        } else {
        System.out.println("cerooooooo");
        }

		
	}

}
