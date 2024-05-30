package desafios;

import java.util.Scanner;

public class Cuarenta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int div;
		int [] tem = new int  [5];
		int suma;
		
		for (int i= 0; i< 4; i++) {
			System.out.println("Ingrese la temperatura acual:");
			tem [i] = entrada.nextInt();
			
		}
		
		
		suma = tem [0] + tem [1] + tem [2] + tem [3] + tem [4] ;
		System.out.println(suma);
		
		div = suma / 5;
		
		System.out.println("el promedio es: " + div);
		
		
		
	}

}
