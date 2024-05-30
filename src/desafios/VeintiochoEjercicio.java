package desafios;

public class VeintiochoEjercicio {

	public static void main(String[] args) throws InterruptedException  {
		int bateria = 100;
		
		System.out.println("La bateria tiene 100%");
		
		
		while ( bateria == 100 || bateria >0) {
			bateria--;
			System.out.println("Bateria : "+bateria );
			
			Thread.sleep(20);
			
	   if (bateria == 20) {
		   Thread.sleep(1000);
		   System.out.println("Bateria baja");}
		   
	  }
		System.out.println("Bateria agotada.");
	   }
			
	
	 
	

}
