package app;

import entities.Funcionario;

public class testeFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Jonatas Marques");
		func.setSalario(3500);
		
		System.out.println("Nome do funcionário: "+func.getNome());
		System.out.println("Salário: "+func.getSalario());
	}

}
