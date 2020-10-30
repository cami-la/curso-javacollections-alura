package site.camila.javacollections;

public class Funcionario {
	    private String nome;
	    private int idade;

	    public Funcionario(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }

	    public String getNome() {
	        return this.nome;
	    } 

	    public void setNome(String nome) {

	        this.nome = nome;

	    }

	    public Integer getIdade() {
	        return this.idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }
	    
	    @Override
	    public String toString() {
	    	return this.getNome();
	    }
}
