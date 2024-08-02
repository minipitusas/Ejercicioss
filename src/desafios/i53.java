package desafios;

import java.security.PublicKey;
import java.util.Scanner;

public class i53 {

	static Scanner entrada = new Scanner(System.in);
	public static int[] can = new int[5];
	public static int min = 10, max = 0, suma = 0, div = 0;

	public static int ingresarDatos() {
		for (int i = 0; i < 5; i++) {

			System.out.println("pone la " + i + " calificacion del alumno:");
			can[i] = entrada.nextInt();
			suma += can[i];
		}
		return div;
	}

	public static int mayormenor() {
		for (int i = 0; i < 5; i++) {
			if (can[i] < min) {
				min = can[i];
			}
			if (can[i] > max) {
				max = can[i];
			}

		}

		return div = suma / 5;
	}

	public static int mostrardatos() {
		System.out.println("La nota mas alta es:" + max);
		System.out.println("La nota mas baja es:" + min);
		System.out.println("El promedio del alumno es: " + div);
		return div;
	}

	public static void main(String[] args) {

		ingresarDatos();
		System.out.println("");
		mayormenor();
		System.out.println("");
		mostrardatos();
	}
}
