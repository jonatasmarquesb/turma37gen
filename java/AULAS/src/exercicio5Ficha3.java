/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
import java.util.*;
public class exercicio5Ficha3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int num,totalNum=0;
		
		do {
			System.out.println("Digite um n�mero");
			num = leia.nextInt();
			
			totalNum += num;
			
			
			
		} while (num!=0);
		
		System.out.println("Soma dos n�meros: "+totalNum);
	}

}
