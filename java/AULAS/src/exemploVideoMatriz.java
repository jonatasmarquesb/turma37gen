import java.util.*;

public class exemploVideoMatriz {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int matriz [][] = new int[3][3];
		//preenchendo as posicoes da matriz
		for (int l=0;l<3;l++) {
			for (int c=0; c<3 ; c++) {
				System.out.printf("Insira as posições da matriz: [%d][%d]",l+1,c+1);
				matriz[l][c] = leia.nextInt();
			}
		}
		//informando as posicoes preenchidas
		
		for (int l=0;l<3;l++) {
			for (int c=0; c<3 ; c++) {
				System.out.printf("[ %d ]",matriz[l][c]);
				
			}
			
			System.out.println();
		}
	}

}
