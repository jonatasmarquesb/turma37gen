package Heran�a;

public class testeUsuario {
	public static void main(String[] args) {
		Usuario u100 = new Usuario("Jon",4506,"Estudante");
		Funcionario f050 = new Funcionario("Joao",7894,"Funcionario","RH");
		Coordenador c005 = new Coordenador("Pedro",5698,"Coordena��o","A45H");
		
		System.out.println("----------------Coordenadores--------------------------");
		System.out.println("Dados do sistema: ");
		System.out.println("Nome: "+c005.getNome());
		System.out.println("Matricula: "+c005.getMatricula());
		System.out.println("Fun��o: "+c005.getFuncao());
		System.out.println("Chave de Acesso Especial: "+c005.getChaveAcessoEspecial());
		
		System.out.println("-------------------Funcion�rios-----------------------------------------");
		
		System.out.println("Dados do sistema: ");
		System.out.println("Nome: "+f050.getNome());
		System.out.println("Matricula: "+f050.getMatricula());
		System.out.println("Fun��o: "+f050.getFuncao());
		System.out.println("Departamento: "+f050.getDepartamento());
		
System.out.println("-------------------Estudantes-----------------------------------------");
		
		System.out.println("Dados do sistema: ");
		System.out.println("Nome: "+u100.getNome());
		System.out.println("Matricula: "+u100.getMatricula());
		System.out.println("Fun��o: "+u100.getFuncao());
		
		
				
		
	}

}
