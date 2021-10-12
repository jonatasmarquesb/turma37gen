package entities;

public class Carro {
	public String cor;
	public String modelo;
	public double velocidadeAtual=0.0;
	public double velocidadeMaxima=0.0;
	
	public void liga()
	{
		System.out.println("O carro está ligando...");
	}
	public void acelera (double quantidade) {
		double velocidadeNova=this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	public int passarMarcha () {
		if (this.velocidadeAtual<0) {
			return 0;
		}
		if (this.velocidadeAtual>0 && this.velocidadeAtual<=15) {
			return 1;
		}
		if (this.velocidadeAtual>15 && this.velocidadeAtual<=30) {
			return 2;
		}
		if (this.velocidadeAtual>30 && this.velocidadeAtual<=40) {
			return 3;
		}
		if (this.velocidadeAtual>40 && this.velocidadeAtual<=60) {
			return 4;
		}
		else {
			return 5;
		}
	}
}
