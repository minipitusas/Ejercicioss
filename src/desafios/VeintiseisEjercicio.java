package desafios;

import java.util.Scanner;

public class VeintiseisEjercicio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int contrase�a =2007, intentos = 0;
		
		System.out.println("Ingrese una contrase�a: ");
		contrase�a = entrada.nextInt();
		intentos++;
		
		while (contrase�a!=2007 && intentos<3) {
			
	   System.out.println("Contrase�a incorrecta. Intente de nuevo");
	   contrase�a = entrada.nextInt();
	   intentos++;
	   System.out.println("Cantidad de intentos: " + intentos);
	
	}
		
		if (intentos == 3 ) {
			System.out.println("el usuario est� bloqueado.");
		}
		
		if (contrase�a == 2007) {
			System.out.println("Ganaste!");
		}
	}
}
