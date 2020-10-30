package site.camila.javacollections;

public class TesteBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		/*Aula a1 = new Aula("Trabalhando com Array List", 21);
		Aula a2 = new Aula("Criando uma aula", 20);
		Aula a3 = new Aula("Modelando com coleções", 22);
		
		javaColecoes.adiciona(a1);
		javaColecoes.adiciona(a3);
		javaColecoes.adiciona(a2);
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		*/
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array List", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		javaColecoes.matricula(new Aluno("Rodrigo Turini", 34672));
		javaColecoes.matricula(new Aluno("Guilherme Silveira", 5617));
		javaColecoes.matricula(new Aluno("Mauricio Aniche", 17645));	
		javaColecoes.matricula(new Aluno("Paulo Silveira", 5617));	

		System.out.println(javaColecoes.getAluno());
		System.out.println("Quem é o aluno com a matricula 5617");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println(aluno);
		
			 
	}
}
