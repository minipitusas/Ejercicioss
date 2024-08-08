package desafios;

import java.util.Scanner;

public class i55 {
	
	static Scanner entrada = new Scanner(System.in);
	public static int[] numeros = new int[4];

	public static int mostrardatos () {
	for (int i = 0; i < 4; i++) {
		System.out.println("Ingrese un DNI: ");
		numeros[i] = entrada.nextInt();

	}

	System.out.println("Arreglo desordenado:");
	for (int num : numeros) {
		System.out.print(num + " ");
	}
	return mostrardatos() ;
	}
	public static int datos () {
	for (int i = 0; i < (numeros.length - 1); i++) {

		for (int j = 0; j < (numeros.length - i - 1); j++) {

			if (numeros[j] > numeros[j + 1]) {

				int temporal = numeros[j];

				numeros[j] = numeros[j + 1];

				numeros[j + 1] = temporal;
			}
			
			System.out.println("\nArreglo ordenado:");
			for (int num : numeros) {
				System.out.print(num + " ");
			}

		}
	}
	return 0 ;
	}
	
	public static void main(String[] args) {
		
		mostrardatos ();
		datos ();
		
	}
}


