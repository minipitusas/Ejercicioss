package desafios;

import java.util.Scanner;

public class CuartoEjercicio {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		int ano, mes, semana, dias;
		
		System.out.println("Ingrese años: ");
		ano = datos.nextInt();
		System.out.println("ingrese meses: ");
		mes = datos.nextInt();
		System.out.println("ingrese semanas: ");
		semana = datos.nextInt();
		
		dias = ano*365 + mes*30 + semana*7;
		
		System.out.println("cantidad de dias: " + dias);
	}
}
