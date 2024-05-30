package desafios;

import java.util.Scanner;

public class TreintaseisEjercicio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int ganancia, min = 1000, max = 0;
		for (int i = 8; i <= 17; i++) {
			System.out.println("Ingrese la cantidad de ganacia: ");
			ganancia = entrada.nextInt();

			if (ganancia < min) {
				min = ganancia;
			}
			if (ganancia > max) {
				max = ganancia;
			}
		}
           System.out.println("La ganancia mas alta es : " + max);
           System.out.println("La ganancia mas baja es : " + min);
	}
}