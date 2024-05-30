package desafios;

import java.util.Scanner;

public class Diesiocho {
       public static void main(String[] args) {
    	   Scanner scanner = new Scanner (System.in);
    	  
    	   System.out.println("Ingrese un talle de remera(S,M o L):");
    	  
    	   char talle = scanner.next().charAt(0);
    	   //GRRRRRRR
    	   switch (talle) {
    	   case 's':
    		   System.out.println("quedan 5 remeras");
    		   break;
    	   case 'S':
    		   System.out.println("quedan 5 remeras");
    		   break;
    	   case 'm':
    		   System.out.println("quedan 2 remeras");
    		   break;
    	   case 'M':
    		   System.out.println("quedan 2 remeras");
    		   break;
    	   case 'l':
    		   System.err.println("no quedan remeras");
    		   break;
    	   case 'L':
    		   System.err.println("no quedan remeras");
    		   break;
    	   }
 }
}
