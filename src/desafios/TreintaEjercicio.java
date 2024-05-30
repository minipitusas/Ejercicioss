package desafios;

public class TreintaEjercicio {
	
public static void main(String[] args) throws InterruptedException {
	
	for (int i = 0; i < 100; i++) {
		Thread.sleep(20);
		System.out.println(+i);
		
		if ( i == 100) {
	   Thread.sleep(1000);
			
}
		if (i == 100) {
			System.out.println("Llegaste a los 100 seguidores!!");
		}

}
}
}