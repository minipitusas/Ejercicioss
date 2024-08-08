package desafios;

import java.util.Scanner;

public class i52 {

	static Scanner entrada = new Scanner (System.in);
	public static int numero2 = 7;
	public static int numero3 = 10;
	public static double mult,div;
	public static double numero;
	
	public static int almacenarDatos() {
	System.out.print("Ingrese el costo de tus compras: ");
    numero = entrada.nextDouble();
    return numero2 ;
	}
	public static int cosasDeNumeros() {
    if (numero > 15000) {
    	mult = numero * numero2;
    	div = mult / numero3;
    	System.out.println("El total de tu compra con el 10% es:" + div);
    }
    else {
    	System.out.println("El total de tu compra es:" + numero);
    }
    return numero2  ; 
}
	
	public static void main(String[] args) {
		
		almacenarDatos() ;
		cosasDeNumeros() ;
	}
}
