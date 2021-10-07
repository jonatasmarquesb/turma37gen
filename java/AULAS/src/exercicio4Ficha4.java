/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/
import java.util.*;
public class exercicio4Ficha4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int linha, coluna, somaTotal=0,somaPrincipal=0;
		
		
		
		for ( linha=0; linha<3; linha++) {
			for (coluna=0; coluna<3; coluna++){
				System.out.println("VALOR: ");
				matriz[linha][coluna] = leia.nextInt();
				somaTotal += matriz[linha][coluna];
				if (linha==coluna) {
					somaPrincipal += matriz[linha][coluna];
				}
				
			}
		}
		
		
		
		
		
		
		for ( linha=0; linha<3; linha++) {
			for (coluna=0; coluna<3; coluna++){
				System.out.printf("[   "+matriz[linha][coluna]+"  ]");
				
			}
			System.out.println();
		}
		System.out.println(" A soma total dos valores da matriz foi: "+somaTotal);
		System.out.println(" A soma da diagonal principal foi: "+somaPrincipal);
	}

}
