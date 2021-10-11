import java.util.*;
public class exemploVideoVetor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int array1[] = {1,2,3,4,5,6,7,8,9,10};
		int array2[] = {1,2,3,4,5,6,7,8};
		
		if (array1.length>10)
			System.out.println("Array 1 tem mais de 10 espaços");
		else 
			System.out.println("Array 1 tem menos ou é igual a 10 espaços");
		
		System.out.println("Quantidade de espaços no array 2: "+array2.length+"\n");
		//for each
		String carros[] = {"ford", "fiat", "citroen"};
		
		for (String i : carros) {
			
			System.out.println(i);
			
		}
		
		//populando um array
		double nota[] = new double[5];
		for (int i=0; i<nota.length; i++) {
			System.out.println("Digite a nota "+(i+1)+":");
			nota[i]= leia.nextDouble();
		}
		//apresentando a array
		for (int i=0; i<nota.length; i++) {
			System.out.println("Nota "+(i+1)+": "+nota[i]);
		}
		
	}

}
