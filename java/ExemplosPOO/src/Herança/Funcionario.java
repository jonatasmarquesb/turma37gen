package Herança;

public class Funcionario extends Usuario {
	private String departamento;

	

	public Funcionario(String nome, int matricula, String funcao, String departamento) {
		super(nome, matricula, funcao);
		this.departamento=departamento;
		// TODO Auto-generated constructor stub
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
