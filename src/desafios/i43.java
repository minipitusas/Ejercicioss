package desafios;

import java.util.Scanner;

public class i43 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] numero = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
		String[] nombre = { "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };

		System.out.println("Para encontrar a un individuo, ingresar número de socio");
		int codigoBuscado = entrada.nextInt();

		boolean encontrado = false;
		int numeroEncontrado = 0;
		String nombre_encontrado="";
		for (int recorrer_array : numero) {
			

			entrada.close();
		}
		for (int i = 0; i < nombre.length; i++) {
			if(i == 8748) {
				continue;
			}
			if(i == 2034) {
				continue;
			}
			if (codigoBuscado == numero[i] ) {
				numeroEncontrado = numero[i];
				nombre_encontrado = nombre [i];
				encontrado = true;
				break;
			}
			
		}
		if (encontrado == true) {
			System.out.println("Sí, el código ingresado está en la lista.");
			System.out.println("El codigo es: " + codigoBuscado);
			System.out.println("y su jugador es:" + nombre_encontrado);
		} 
		else {
			System.out.println("No ha codigo papu");
		}
	}


}
