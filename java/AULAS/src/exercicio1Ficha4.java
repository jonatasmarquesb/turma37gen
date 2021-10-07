/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/
import java.util.*;
public class exercicio1Ficha4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int[4];
		int maiorNumero=0;
		
		for (int x=0; x<=3 ; x++) {
			System.out.println("Digite a pontuação "+x+1+":");
			num [x] = leia.nextInt();
			
			if (num[x]>maiorNumero) {
				maiorNumero=num[x];
			}
		}
		for (int x = 0; x<=0; x++) {
			System.out.println("\nA maior pontuação é: "+maiorNumero);
		}
			
		
	}

}
