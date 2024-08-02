package desafios;

import java.util.Scanner;

public class Cuarenttados {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		int [] numa = new int [3];
		
		double numeroAleatorio = (Math.random()*50);
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese tres numeros:");
			numa[i] = entrada.nextInt();
			
		
		}
		
		
		
	}

}
