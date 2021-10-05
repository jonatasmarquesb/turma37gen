import java.util.*;
public class exercicio3Ficha2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14)
			System.out.println("Você é infantil");
		else if (idade>=15 && idade<=17)
			System.out.println("Você é juvenil");
		else if (idade>=18 && idade<=25)
			System.out.println("Você é adulto");
		else {
			System.out.println("O programa só aceita idades entre 10 e 25 anos");
		}
		
	}

}
