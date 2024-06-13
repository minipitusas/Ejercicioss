package desafios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class i45 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		List<String> lista = new ArrayList<>();
		String paises;

		lista.add("Argentina");
		lista.add("Bolivia");
		lista.add("Brasil");
		lista.add("Colombia");
		lista.add("Ecuador");
		lista.add("Guyana");
		lista.add("Paraguay");
		lista.add("Perú");
		lista.add("Surinam");
		lista.add("Uruguay");
		lista.add("Venezuela");

		System.out.println("Pone un pais:");
		paises = entrada.next();

		if (lista.contains(paises)) {
			System.out.println("Este pais es sudamericano");
		} else {
			System.out.println("Este pais no es sudamericano");
		}

		System.out.println("Lista de países sudamericanos ordenados alfabéticamente:");
		for (String paisesss : lista) {
			System.out.println(paisesss);
		}

		entrada.close();
	}

}
