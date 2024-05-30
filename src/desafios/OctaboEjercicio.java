package desafios;

import java.util.Scanner;

public class OctaboEjercicio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
       
        System.out.print("Ingrese un número con dos decimales (por ejemplo, 3.46): ");
        double numero = scanner.nextDouble();
        
       
        int numeroCuadrado = (int) Math.pow(numero, 2);
        
        
        double valorRandom = Math.random();
        
        
        double resultado = (numeroCuadrado + valorRandom) * 7;
        
       
        double raizCuadrada = Math.sqrt(resultado);
        
        
        System.out.println("El resultado final es: " + raizCuadrada);
        
        
        scanner.close();
    }

	}
