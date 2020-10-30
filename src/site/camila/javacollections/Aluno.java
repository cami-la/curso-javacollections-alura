package site.camila.javacollections;

public class Aluno implements Comparable <Aluno> {
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser null!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getNumeroMatricula() {
		return this.numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.getNome() + ", " + this.getNumeroMatricula() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		return this.getNumeroMatricula().compareTo(outroAluno.getNumeroMatricula());
	}

}
