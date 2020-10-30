package site.camila.javacollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private int tempo;
	private int totalAlunos;
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		this.tempo = 0;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public List<Aula> getAula() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAluno() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		this.tempo += aula.getTempo(); 
	}
	
	/*public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	*/
	
	/*public int getTotalAlunos() {
		return this.alunos.size();
	}
	*/

	@Override
	public String toString() {
		return "Curso: " + this.getNome() + ", Alunos Matriculados: " + this.alunos.size() + ", Tempo total: " + this.tempo + "m" + "\n"
				+ "Aulas: " + this.getAula(); 
	}


	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);		
	}


	public boolean estaMatriculado(Aluno aluno) {
	    return this.alunos.contains(aluno);
	}


	public Aluno buscaMatriculado(int numeroMatricula) {
		if (!this.matriculaParaAluno.containsKey(numeroMatricula)) {
			throw new NoSuchElementException();
		}
		return this.matriculaParaAluno.get(numeroMatricula);
	}
}
