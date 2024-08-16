package desafios;

import java.util.Scanner;

public class i56 {
	static Scanner entrada = new Scanner(System.in);
	static String nombre, apellido;
	static String nombre_min;
	static String apellido_may;

	public static void Ingresodedatos() {

		System.out.println("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Ingrese su apellido: ");
		apellido = entrada.nextLine();
	}

	public static void Mostrardatos() {

		nombre_min = nombre.toLowerCase();
		apellido_may = apellido.toUpperCase();
		
		System.out.println("Su nombre es: " + nombre_min);
		System.out.println("Su apellido es: " + apellido_may);
		
		System.out.println("Su nombre tiene: " + nombre_min.length() + " caracteres");
		System.out.println("Su apellido tiene: " + apellido_may.length() + " caracteres");
		
	}

	public static void main(String[] args) {

		Ingresodedatos();
		Mostrardatos();

	}
}
