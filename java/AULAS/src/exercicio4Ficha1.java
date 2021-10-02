import java.util.Scanner;

/*programa
{
	
	funcao inicio()
	{
		inteiro A, B, C, R, S, D

		escreva("digite o valor A:")
		leia (A)
		escreva("digite o valor B:")
		leia (B)
		escreva("digite o valor C:")
		leia (C)

		R = (A + B)*(A + B)
		S = (B + C)*(B + C)
		D = (R + S)/2

		escreva("O valor é:",D)
	}
}*/
public class exercicio4Ficha1 {
	public static void main(String[] args) {
		int A, B, C, R, S, D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor A:");
		A = leia.nextInt();
		System.out.println("Digite o valor B:");
		B = leia.nextInt();
		System.out.println("Digite o valor C:");
		C = leia.nextInt();
		
		R = (A+B)*(A+B);
		S = (B+C)*(B+C);
		D = (R+S)/2;
		
		System.out.println("O valor é: "+D);
	}

}
