/*2- Ler 10 números e imprimir quantos são 
 * pares e quantos são ímpares. (FOR)*/

public class exercicio2Ficha3 {
	public static void main(String[] args) {
		
		for(int x=1; x<=10; x++) {
			if (x % 2 ==0) 
				
				System.out.println(x+"--> PAR");
			else {
				System.out.println(x+"--> ÍMPAR");
			}
			
		}
		;
	}
}
