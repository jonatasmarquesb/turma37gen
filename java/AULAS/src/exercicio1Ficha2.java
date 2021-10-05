import java.util.Scanner;

public class exercicio1Ficha2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c,maiorNumero=0;
		
		System.out.println("Digite o valor A");
		a = leia.nextInt();
		System.out.println("Digite o valor B");
		b = leia.nextInt();
		System.out.println("Digite o valor C");
		c = leia.nextInt();
		
		if (a>b && a>c) {
			maiorNumero=a;
		}
		else if (b>a && b>c) {
			maiorNumero=b;
		}
		else if (c>a && c>b) {
			maiorNumero=c;
		}
		System.out.println("O maior núméro é "+maiorNumero);
	}

}
