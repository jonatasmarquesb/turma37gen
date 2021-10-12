package Herança;

public class Usuario {
	private String nome;
	private int matricula;
	private String funcao;
	
	public Usuario(String nome, int matricula, String funcao) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.funcao=funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
