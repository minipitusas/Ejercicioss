package desafios;

import java.util.Scanner;

public class VeintiseisEjercicio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int contraseña =2007, intentos = 0;
		
		System.out.println("Ingrese una contraseña: ");
		contraseña = entrada.nextInt();
		intentos++;
		
		while (contraseña!=2007 && intentos<3) {
			
	   System.out.println("Contraseña incorrecta. Intente de nuevo");
	   contraseña = entrada.nextInt();
	   intentos++;
	   System.out.println("Cantidad de intentos: " + intentos);
	
	}
		
		if (intentos == 3 ) {
			System.out.println("el usuario está bloqueado.");
		}
		
		if (contraseña == 2007) {
			System.out.println("Ganaste!");
		}
	}
}
