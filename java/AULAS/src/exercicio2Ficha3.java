/*2- Ler 10 n�meros e imprimir quantos s�o 
 * pares e quantos s�o �mpares. (FOR)*/

public class exercicio2Ficha3 {
	public static void main(String[] args) {
		
		for(int x=1; x<=10; x++) {
			if (x % 2 ==0) 
				
				System.out.println(x+"--> PAR");
			else {
				System.out.println(x+"--> �MPAR");
			}
			
		}
		;
	}
}
