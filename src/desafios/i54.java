package desafios;

import java.util.Scanner;

public class i54 {
	static Scanner entrada = new Scanner (System.in);

	public static int [] numa = new int [3];
	
	static double numeroAleatorio = (Math.random()*50);
	
	public static int mostrardatos () {
	for (int i = 0; i<3; i++) {
		System.out.println("Ingrese tres numeros:");
		numa[i] = entrada.nextInt();
	}
	return 0;
	}
	public static void main(String[] args) {
		mostrardatos();
		
	}
}



