package desafios;

import java.util.Scanner;

public class DoceEjercicio {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner (System.in);
    	
        System.out.print("Ingrese la calificacion del alumno: ");
        double numero = scanner.nextDouble();	
        
        if (numero == 1){
        	System.out.println("INSUFICIENTE");
        } 
        else if (numero == 2) {
            System.out.println("INSUFICIENTE");
        }
        else if (numero == 3) {
            System.out.println("INSUFICIENTE");
        }
        else if (numero == 4) {
            System.out.println("NO LOGRADO");
        }
        else if (numero == 5) {
            System.out.println("NO LOGRADO");
        }
        else if (numero == 6) {
            System.out.println("SUFICIENTE");
        }
        else if (numero == 7) {
            System.out.println("SUFICIENTE");
        }
        else if (numero == 8) {
            System.out.println("NOTABLE");
        }
        else if (numero == 9) {
            System.out.println("NOTABLE");
        }
        else if (numero == 10) {
            System.out.println("SOBRESALIENE");
        }
        else {
        	System.out.println("VALOR INCORRECTO");
        }
	}
	
}
