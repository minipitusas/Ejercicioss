package desafios;

import java.util.Scanner;

public class TreinadosEjercicio {
	
	public static void main(String[] args) {
		Scanner papapa = new Scanner (System.in);
		double mult;
        System.out.println("ingrese un numero que se muliplique por 20:");
		double numero = papapa.nextDouble();

		for (int i = 1 ; i<= 20 ; i++) {
			mult = numero * i ;
			System.out.println("el numero " + numero + " multiplicado por "+ i + " es:" + mult);
		}
	}
	}
	


