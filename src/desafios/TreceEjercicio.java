package desafios;

import java.util.Scanner;

public class TreceEjercicio {
	public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
		
        System.out.print("Ingrese un talle de remera(S,M o L): ");
        char talle = scanner.next().charAt(0);	
		
        if (talle == 's'){
        	System.out.println("Quedan 5 remeras");
        }
        else if (talle == 'S'){
        	System.out.println("Quedan 5 remeras");
        }
        else if (talle == 'm'){
        	System.out.println("Quedan 2 remeras");
        }
        else if (talle == 'M'){
        	System.out.println("Quedan 2 remeras");
        }
        else if (talle == 'l'){
        	System.out.println("No quedan remeras");
        }
        else if (talle == 'L') {
        	System.out.println("No qudan remeras");
        }
        else {
        	System.out.println("talle inexistente");
        }
	}
 
}
