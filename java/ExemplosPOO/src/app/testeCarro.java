package app;

import entities.Carro;

public class testeCarro {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		
		meuCarro.cor="Vermelho";
		meuCarro.modelo="C3";
		meuCarro.velocidadeAtual=0.0;
		meuCarro.velocidadeMaxima=80.0;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println("Velocidade: "+meuCarro.velocidadeAtual);
		meuCarro.passarMarcha();
		System.out.println("Marcha: "+meuCarro.passarMarcha());
		
		meuCarro.acelera(80);
		System.out.println("Velocidade: "+meuCarro.velocidadeAtual);
		meuCarro.passarMarcha();
		System.out.println("Marcha: "+meuCarro.passarMarcha());
		
		
		

		
	}
	
}
