package desafios;

import java.util.Scanner;

public class VeintcincoEjercicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		char desicion;
		boolean puedosalir = false;

		do {

			System.out.println("\tPuedo salir?: ");
			System.out.println("Puedo salir?:");
			desicion = entrada.next().charAt(0);

		} while (desicion == 'N' || desicion == 'n');
		puedosalir = true;
		{

		}

	}

}
