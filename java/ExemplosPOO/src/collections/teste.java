package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class teste {
	public static void main(String[] args) {
		
		Collection<String> nomes = new ArrayList();
		nomes.add("jon");
		nomes.add("fulano");
		nomes.add("ciclano");
		nomes.add("testonildo");
		
		System.out.println("A lista contem testonildo?"+nomes.contains("testonildo"));
		System.out.println("A lista de nomes � :"+nomes);
		
		Collection<String> nomes2 = Arrays.asList("Joao","Maria");
		nomes.addAll(nomes2);
		
		System.out.println("A lista de nomes � :"+nomes);
		
		for (String name : nomes) {
			
			System.out.println("A lista de nomes � :"+name);
		}
		
		/*System.out.println("A lista de nomes � :"+nomes);
		
		nomes.remove("jon");
		System.out.println("A lista de nomes � :"+nomes);
		nomes.removeAll(nomes);
		if (nomes.isEmpty()) {
		System.out.println("A lista de nomes � vazia");
		}
		System.out.println("A lista de nomes � :"+nomes);*/
		
	}

}
