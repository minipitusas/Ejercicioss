package desafios;

import java.util.Scanner;

public class QuinceEjercicio {

	public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
		int numero2 = 7;
		int numero3 = 10;
        double mult,div;
		
		System.out.print("Ingrese el costo de tus compras: ");
        double numero = entrada.nextDouble();
        
        if (numero > 15000) {
        	mult = numero * numero2;
        	div = mult / numero3;
        	System.out.println("El total de tu compra con el 10% es:" + div);
        }
        else {
        	System.out.println("El total de tu compra es:" + numero);
        }
	}
}!
