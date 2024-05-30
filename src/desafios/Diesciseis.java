package desafios;

import java.util.Scanner;

public class Diesciseis {

	public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
		
        System.out.print("Ingrese la hora: ");
        double numero = scanner.nextDouble();
        if (numero > 24) {
        	System.out.println("no se puede colocar esa hora");
        } 
        else {
        }
        System.out.println("Ingrese los minutos:");
        double numero2 = scanner.nextDouble();
        if (numero2 > 60) {
        	System.out.println("no se puede colocar esos minutos");
        }
        else {
        }
        System.out.println("Ingrese los segundos:");
        double numero3 = scanner.nextDouble();
        if (numero3 > 60) {
        	System.out.println("no se puede colocar esos segundos");
        }
        else {
        }
	}
}
