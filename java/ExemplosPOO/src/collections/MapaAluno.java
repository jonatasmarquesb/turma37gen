package collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {
		
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno ("Joao", "Java",8.6);
		Aluno b = new Aluno ("Renata", ".NET",6.5);
		Aluno c = new Aluno ("Jon", "Java",9.5);
		Aluno d = new Aluno ("Gabriel", ".NET",8.0);
		
		mapa.put("Joao", a);
		mapa.put("Renata", b);
		mapa.put("Jon", c);
		mapa.put("Gabriel", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata"));
		
		Collection<Aluno> alunos = mapa.values();
		
		for (Aluno e : alunos) {
			
			System.out.println(e);
			
		}
		
		
		
	
}
}
