package entities;

public class produtos {

	public String codigo;
	public String nome;
	public double valor;
	public int estoque;

	public void tirarEstoque(int quantidade) {
		estoque = estoque - quantidade;
	}

	public void colocarEstoque(int quantidade) {
		estoque = estoque + quantidade;
	}

}
