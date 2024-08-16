import java.util.Scanner;

public class i59 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {

			System.out.println("Ingrese su edad: ");
			int edad = entrada.nextInt();

			if (edad <= 0) {

				System.out.println("El valor ingresado no es correcto");
				throw new Exception();
			}

		} catch (Exception e) {

			System.out.println("Ocurrio un error: " + e.getMessage());

		}

	}

}
