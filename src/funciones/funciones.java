package funciones;

import java.util.Scanner;

public class funciones {

    public static boolean analizarSiTrabaja (String respuesta) {
        
        if (respuesta.equalsIgnoreCase("si")) {
            return true;
        } else {
            return false;
        }
       
       
    }
   
    // FUNCION CANTIDADANIMALES
    public static void cantidadAnimales(int gatos, int perros) {
        System.out.println("La cantidad de perros es: "+ perros);
        System.out.println("La cantidad de gatos es: "+ gatos);
    }
	
	
	static Scanner entrada = new Scanner(System.in);

	static String apellido;

	static float altura = 1.8f;

	public static void IngresarNombre() {

		System.out.println("Ingresa tu nombre:");
		String nombre = entrada.next();

		System.out.println("Ingresa tu apellido: ");
		apellido = entrada.next();

	}

	public static float AlmacenarAltura(float altura) {
		altura = altura;

		return altura;
	}
	
	public static int filtrarEdad(int edad) {
		
		if (edad>18) {
			return edad;
		}
		
		else { 
			return edad -1;
		}
		
	}

	public static void main(String[] args) {

		IngresarNombre();
		System.out.println(AlmacenarAltura(altura));
		AlmacenarAltura(altura );
		filtrarEdad(25);

		// ¿Lleva parámetros y argumentos esta función? ¿Por qué? Definir parámetros y
		// argumentos.

		/* No, no lleva parametros ni argumentos porque no hay. */

		// ¿Cuál es la variable local, y cuál la global? Mencioná dos diferencias entre
		// variables locales y globales.

		/*
		 * La variable global es apellido, y la variable local nombre.Variable global
		 * ocupa toda la clase, y la local pertenece a cada funcion,solo ocupa memoria
		 * cuando se llama la funcion
		 */

	}
}
