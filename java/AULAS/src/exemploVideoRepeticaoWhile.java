import java.util.Scanner;

public class exemploVideoRepeticaoWhile {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Entre com sua idade: ");
		idade = leia.nextInt();
		
		 do {
			System.out.println("Sua idade �: "+idade);
			if (idade>=18) {
				System.out.println("Voc� � maior de idade.");
			}else if (idade<18) {
				System.out.println("Voc� � de menor");}
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();
		}while (idade>=1);
		
		
		
	}
}
