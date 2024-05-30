package desafios;

public class VeinteEjercicio {
	public static void main(String[] args) throws InterruptedException {
		
	int Num_seguidores = 0; 
	
	while (Num_seguidores < 100) {
		
		System.out.println(Num_seguidores);
		
		Thread.sleep(20);
		Num_seguidores++;
	}
	if (Num_seguidores == 100) {
		System.out.println("Llegaste a los 100 seguidores!!");
	}
	}
	

}
