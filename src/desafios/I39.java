package desafios;

import java.util.Scanner;

public class I39 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Mes meses;
		
		String ingresodedatos;
		 
		
		System.out.println("Ingrese un mes");
		ingresodedatos = entrada.nextLine().toUpperCase();
				
		meses = Mes.valueOf(ingresodedatos);
		
		switch ( meses ) {
		
		case ENERO:
		case MARZO:
		case MAYO:
		case JULIO:
		case AGOSTO:
		case OCTUBRE:
		case DICIEMBRE:
			System.out.println("31");
			break;
			
		case FEBRERO:
			System.out.println("28");
		
		
		case ABRIL:
		case JUNIO:
		case SEPTIEMBRE:
	    case NOVIEMBRE:
		System.out.println("30");
			
		
		}
		
	
		
		
	}

}
