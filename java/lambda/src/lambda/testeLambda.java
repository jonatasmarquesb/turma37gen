package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testeLambda {
	public static void main(String[] args) {
		System.out.println("Imprima todos os elementos da lista");
		
		List<Integer> teste = Arrays.asList(10,20,30,40);
		
		teste.forEach(x -> {System.out.println(x);});
	}

}
