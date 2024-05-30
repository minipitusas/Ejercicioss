package desafios;

import java.util.Scanner;

public class VeintiunoEjercicio {

	public static void main(String[] args) throws InterruptedException {

		int grado = 35;

		System.err.println("35° Grados");

		while (grado <= 100) {

			System.out.println(grado+  "°C");
			
			if(grado <85) {
				grado += 2;
			}
			
		
			Thread.sleep(20);

			if (grado == 85) {
				System.out.println("“CUIDADO!, TEMPERATURA PELIGROSA”.");

				Thread.sleep(1000);
			}
			if(grado>=85) {
				grado++;
			}
		}

		
			System.out.println("VALOR EXTREMO APAGANDO PC");

		

	}

}
