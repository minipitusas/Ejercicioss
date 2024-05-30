package desafios;

import java.util.Scanner;

public class Treintaycuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int mes;

		for (int i = 1; i <= 12; i++) {

			System.out.println("Ingrese las ganancias del mes " + i + ":");
			mes = entrada.nextInt();

			if (mes < 100000) {
				System.out.println("Por lo menos en un mes un ingreso menor a $100000.");
			}
		}

	}
}
