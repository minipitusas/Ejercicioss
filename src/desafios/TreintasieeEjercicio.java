package desafios;

public class TreintasieeEjercicio {

	public static void main(String[] args) {

		int min = 50;
		int max = 0;

		for (int i = 9; i <= 19; i += 2) {

			int NumAleatorio = (int) (Math.random() * 50);
			System.out.println(NumAleatorio);

			if (NumAleatorio < min) {
				min = NumAleatorio;
			}
			if (NumAleatorio > max) {
				max = NumAleatorio;
			}

		}
		
		System.out.println("La cantidad maxima de clientes es: " +max );
		System.out.println("La cantidad minima de clientes es: " + min);
	}
}
