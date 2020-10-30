package site.camila.javacollections;

import java.util.Iterator;

public class TesteCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array List", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		//System.out.println(javaColecoes);
		//System.out.println(javaColecoes.getAluno());
		
		System.out.println("    Alunos Matriculados:");
		javaColecoes.getAluno().forEach(aluno -> {System.out.println(aluno);});
		System.out.println("---------");
		System.out.print("O aluno " + a2.getNome() + " está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a2));
		
		Aluno guilherme = new Aluno("Guilherme Silveira", 5617);
		System.out.print("E esse Guilherme, está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(guilherme));
		
		System.out.print("O a2 é equals ao Guilherme? ");
		System.out.println(a2.equals(guilherme));
		System.out.println("---------");
		
		Iterator<Aluno> iterador = javaColecoes.getAluno().iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}

}
