package desafios;

import java.util.Scanner;

    public class VeintisieteEjercicio {
    public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
		
	int contraseņa =2007, intentos = 0;
	boolean contrase = false;
		
	  System.out.println("Ingrese una contraseņa: ");
	  contraseņa = entrada.nextInt();
	  intentos++;
		
	if (contraseņa == 2007) {
				contrase = true;
		 }
		
		
	while (contraseņa!=2007 && intentos<3) {
			
	   System.out.println("Contraseņa incorrecta. Intente de nuevo");
	   contraseņa = entrada.nextInt();
	   intentos++;
	   System.out.println("Cantidad de intentos: " + intentos);
	   }
	
	 if (intentos == 3 ) {
			System.err.println("El usuario esta bloqueado.");
		}
		
	 if (contrase == true) {
			System.out.println("Ganaste!");
		}
	}
}
