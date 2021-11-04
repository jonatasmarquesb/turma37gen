package collections;

import java.util.HashSet;
import java.util.Set;

public class listaAluno {
	public static void main(String[] args) {
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno ("Joao", "Java",8.6);
		Aluno b = new Aluno ("Renata", ".NET",6.5);
		Aluno c = new Aluno ("Jon", "Java",9.5);
		Aluno d = new Aluno ("Gabriel", ".NET",8.0);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		System.out.println(conjunto);
		
	}

}
