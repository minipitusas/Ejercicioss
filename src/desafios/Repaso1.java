package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Repaso1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int buscarDNI = 0;
		int Cant_elementos;
		ArrayList<String> apellidos = new ArrayList<>();
		
		System.out.println("Ingrese algun apellido: ");
		
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		

		for (int i = 0; i< apellidos.size(); i++) {
			System.out.println("Ingrese un DNI: ");
			apellidos.add  (entrada.nextInt(), null);
	}
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese un nombre: ");
			nombres[i] = entrada.next();
	}
		
		for (int i = 0; i < (numeros.length - 1); i++) {

			for (int j = 0; j < (numeros.length - i - 1); j++) {

				if (numeros[j] > numeros[j + 1]) {

					int temporal = numeros[j];

					numeros[j] = numeros[j + 1];

					numeros[j + 1] = temporal;
				}
}
		}
		for (int i = 0; i < nombres.length - 1; i++) {
			for (int j = 0; j < nombres.length - i - 1; j++) {
				if (nombres[j].compareTo(nombres[j + 1]) > 0) {
					// Intercambiar las palabras
					String temp = nombres[j];
					nombres[j] = nombres[j + 1];
					nombres[j + 1] = temp;
				}
			}
		}
		System.out.println("\nLista ordenada:");
		for (String palabra : nombres) {
			System.out.print( palabra + " ");
		}
		System.out.println("");
		
		System.out.println("\nLista ordenada:");
		for (int palabra : numeros) {
			System.out.print( palabra + " ");
		}
		System.out.println("");
		
		System.out.println("Para encontrar a un individuo, ingresar número");
		int codigoBuscado = entrada.nextInt();

		boolean encontrado = false;
		
		for (int i = 0; i < numeros.length ; i++) {
			
			if(buscarDNI==numeros[i]) {
				System.out.println("DNI:" + numeros[i]);
				System.out.println("Nombre:" + nombres[i]);
				encontrado = true;
				break;
			}
		}
		
		System.out.println("1.Eliminar");
		System.out.println("2.Modificar");
		System.out.println("3.Salir del programa");
		System.out.println("Coloque lo que quiere hacer:");
		int pa = entrada.nextInt();
		
		if (pa == 1) {
		System.out.println("Que elemento desea borrar?");
        
        String elementoABorrar = entrada.next(); 
      
        int posicionEnLaLista = numeros.indexOf(elementoABorrar);
      
        numeros.remote(posicionEnLaLista);
		 }
		
		}
	
	
}