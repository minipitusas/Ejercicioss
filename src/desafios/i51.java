package desafios;

import java.util.Scanner;

public class i51 {
	static Scanner entrada = new Scanner(System.in);
	static int numero;

	public static float almacenarAltura() {
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();
		return numero;
	}

	public static boolean negativPositiv() {

		if (numero > 0) {

			System.out.println("Numero postivo");
			return false;

		}

		else {

			System.out.println("Numero negativo");
			return true;
		}

	}

	public static void main(String[] args) {
        almacenarAltura();
		negativPositiv();
	}

}
