package desafios;

import java.util.Scanner;

    public class VeintisieteEjercicio {
    public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
		
	int contrase�a =2007, intentos = 0;
	boolean contrase = false;
		
	  System.out.println("Ingrese una contrase�a: ");
	  contrase�a = entrada.nextInt();
	  intentos++;
		
	if (contrase�a == 2007) {
				contrase = true;
		 }
		
		
	while (contrase�a!=2007 && intentos<3) {
			
	   System.out.println("Contrase�a incorrecta. Intente de nuevo");
	   contrase�a = entrada.nextInt();
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
