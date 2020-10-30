package site.camila.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListasDeAulas {
	public static void main(String[] args) {
		Aula aula01 = new Aula("Revistando as ArrayList", 21);
		Aula aula02 = new Aula("Listas de objetos", 20);
		Aula aula03 = new Aula("Relacionamento de Listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(aula01);
		aulas.add(aula02);
		aulas.add(aula03);
		
		System.out.println(aulas.toString());
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}
