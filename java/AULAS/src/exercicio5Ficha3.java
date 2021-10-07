/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
import java.util.*;
public class exercicio5Ficha3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int num,totalNum=0;
		
		do {
			System.out.println("Digite um número");
			num = leia.nextInt();
			
			totalNum += num;
			
			
			
		} while (num!=0);
		
		System.out.println("Soma dos números: "+totalNum);
	}

}
