package desafios;

import java.util.Scanner;

public class y54 {

	static Scanner entrada = new Scanner(System.in);

	public static int[] numero = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
	public static String[] nombre = { "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
	public static int codigoBuscado;
	public static boolean encontrado;
	public static int numeroEncontrado;
	public static String nombre_encontrado;
	
	public static int mostrardatos () {
	System.out.println("Para encontrar a un individuo, ingresar número de socio");
	codigoBuscado = entrada.nextInt();

	encontrado = false;
	
	numeroEncontrado = 0;
	nombre_encontrado="";
	for (int recorrer_array : numero) {
		

		entrada.close();
	}
	return codigoBuscado ;
	}
	public static void datos () {
	for (int i = 0; i < nombre.length; i++) {
		
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
	
	public static void main(String[] args) {
		
		mostrardatos ();
		datos ();
	}
}
	

