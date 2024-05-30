package desafios;

import java.util.Scanner;

public class VeinticuatroEjercicio {
      public static void main(String[] args) throws InterruptedException {
    	  Scanner entrada = new Scanner (System.in);
    	  
    	  float n1,n2,suma;
    	  int salir;
    	  boolean quieresalir = false;
    	  
    	  System.out.println("Solicitar dos numeros que quieras sumar:)");
    	  
    	  do {
    		  System.out.println("ingrese un numero:");
    		  n1 = entrada.nextInt();
    		  
    		  System.out.println("ingrese otro numero");
    		  n2 = entrada.nextInt();
    				  
    	      suma = n1 + n2;
    		  
    		  Thread.sleep(500);
    		  System.out.println("El resultado de la suma:" + suma);
    		  Thread.sleep(500);
    		  System.out.println("para salir, presione 0. si no, ingrese cualquier otro numero.");
    		  salir = entrada.nextInt();
    		  
    		  if (salir == 0) {
    			  quieresalir = true;
    		  }
    		  else {
    			  quieresalir = false;
    		  }
    		  Thread.sleep(500);
    		  
    	  
    		  
    		  
    	  }while (quieresalir == false);
    	  
    	  Thread.sleep(500);
    	  
    	  System.err.println("Salienso...");
      
    	  
      }
    	  
}

