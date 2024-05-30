package desafios;

import java.util.Scanner;

public class CatorceEjercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Ingrese un número: ");
        double numero = entrada.nextDouble();
        
        if (numero != 0) {
        	System.out.println("Se puede dividir :)");
        }
        else {
        	System.out.println("No se puede dividir :(");
        }
	}
}
