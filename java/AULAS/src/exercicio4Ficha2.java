import java.util.*;

public class exercicio4Ficha2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num,raizQuadrada,numElevadoa4;
		
		System.out.println("Insira um n�mero");
		num = leia.nextInt();
		
		if (num%2==0) {
			
			System.out.println("Este n�mero � par e sua raiz quadrada �: "+Math.sqrt(num));
		}
		else {
			num=(num)*(num)*(num)*(num);
			System.out.println("Este n�mero � impar e elevado a 4 fica: "+num);
		}
			
		
	}

}
