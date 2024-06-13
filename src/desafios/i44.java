package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class i44 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		Scanner entrada = new Scanner(System.in);

		String equipodefutbol;
		
        
		System.out.println("Ingrese un equipo de futbol");
		equipodefutbol = entrada.nextLine();
        
		while (!equipodefutbol.equalsIgnoreCase("fin")) {
			lista.add(equipodefutbol);
			equipodefutbol = entrada.nextLine();
		}

		HashSet<String> set = new HashSet<>(lista);
		lista.clear();

		lista.addAll(set);

		System.out.println("Lista con duplicados: " + lista);

	}

}
