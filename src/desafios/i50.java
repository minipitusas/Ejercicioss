package desafios;

import java.util.Scanner;

public class i50 {
	
	static Scanner entrada = new Scanner (System.in);
    static String nombre;
	public static void 	ingresarDatos() {
		
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		
	}
	
	public static void mostrarDatos() {
		
		System.out.println("Su nombre es: " + nombre);
		
		
	}
	
	public static void main(String[] args) {
		
		for (int i=0; i<3; i++) {
			ingresarDatos();
			mostrarDatos();
		}
	
		}
	}


