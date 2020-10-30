package site.camila.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array List", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		//System.out.println(javaColecoes.getAula());
		
		List<Aula> aulasImutaveis = javaColecoes.getAula();
		System.out.println(aulasImutaveis);
	
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		//System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);

		
		/*Collections.sort(aulas);
		System.out.println(aulas);
		*/
	}
}
