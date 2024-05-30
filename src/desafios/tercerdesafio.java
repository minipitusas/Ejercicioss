package desafios;

import java.util.Scanner;

public class tercerdesafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		float numero1,numero2,suma,resta,mult,div;
		
		System.out.println("coloque dos numeros:");
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		mult = numero1 * numero2;
		div = numero1 / numero2;

		System.out.println("\nla suma es:" + suma);
		System.out.println("\nla resta es:" + resta);
		System.out.println("\nla multiplicacion es:" + mult);
		System.out.println("\nla division es:" + div);
	}

}
