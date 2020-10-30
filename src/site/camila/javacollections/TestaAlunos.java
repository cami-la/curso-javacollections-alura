package site.camila.javacollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		
		alunos.forEach(aluno -> {System.out.println(aluno);});
		
		System.out.println(alunos.contains("Paulo Silveira"));
		alunos.remove("Sergio Lopes");
		
		alunos.forEach(aluno -> {System.out.println(aluno);});
		
		List<String> alunosEmlista = new ArrayList<>(alunos);
		
	}
}
