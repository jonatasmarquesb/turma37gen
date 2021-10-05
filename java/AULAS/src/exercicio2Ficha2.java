import java.util.*;
public class exercicio2Ficha2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1=0,n2=0,n3=0;
		
		System.out.println("Digite o valor 1");
		n1 = leia.nextInt();
		System.out.println("Digite o valor 2");
		n2 = leia.nextInt();
		System.out.println("Digite o valor 3");
		n3 = leia.nextInt();
		
		if ((n1 > n2) && (n2 > n3))
            System.out.println( n3 + "-" + n2 + "-" + n1);
        else if ((n1 < n2) && (n1 > n3))
            System.out.println( n3 + "-" + n1 + "-" + n2);
        else if ((n2 > n1) && (n2 < n3))
            System.out.println( n1 + "-" + n2 + "-" + n3);
        else if ((n2 < n3) && (n1 > n3))
        	System.out.println( n2 + "-" + n3 + "-" + n1);
        else if ((n3 > n1) && (n3 < n2))
            System.out.println( n1 + "-" + n3 + "-" + n2);
        else if ((n2 < n1) && (n1 < n3))
            System.out.println( n2 + "-" + n1 + "-" + n3);
	}

}
