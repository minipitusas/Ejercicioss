package desafios;

public class Veintinueve {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("La bateria tiene 100%");
		
		for (int i = 100; i == 100 || i >0; i-- ) {
        System.out.println("Bateria : "+i );
			
	    Thread.sleep(20);
			
	    if (i == 20) {
	    Thread.sleep(1000);
	    System.out.println("Bateria baja");}
		}
		System.out.println("bateria agotada");
		
	}

}
//El ejercicio que tiene menos lineas de codigo es el ejercicio 29
