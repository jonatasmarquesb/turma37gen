package Herança;

public class Coordenador extends Usuario {
	private String chaveAcessoEspecial;

	

	public Coordenador(String nome, int matricula, String funcao, String chaveAcessoEspecial) {
		super(nome, matricula, funcao);
		this.chaveAcessoEspecial=chaveAcessoEspecial;
		// TODO Auto-generated constructor stub
	}

	public String getChaveAcessoEspecial() {
		return chaveAcessoEspecial;
	}

	public void setChaveAcessoEspecial(String chaveAcessoEspecial) {
		this.chaveAcessoEspecial = chaveAcessoEspecial;
	}
	
	
	
	

}
