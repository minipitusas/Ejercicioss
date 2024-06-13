package desafios;

import java.util.Scanner;

public class i46 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		pais pas;
		
		String papa;
		
		System.out.println("Ingrese un pais:");
		papa = entrada.nextLine().toUpperCase();
		pas= pais.valueOf(papa);
		
		switch ( pas ) {
		
		case ARGENTINA :
		case BRASIL:
		case PARAGUAY:
		case COLOMBIA:
		case VENEZUELA:
		case ECUADOR:
		case BOLIVIA:
		case CHILE:
		case SURINAM:
		case URUGUAY:
		case PERU: 
		case GUYANA:
			System.out.println("Es un pais de america del sur");
			break;
			
			}
		}
	}


