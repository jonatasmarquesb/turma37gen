package app;
import java.util.*;
import entities.contaEspecial;

public class testeBanco {
	public static void main(String[] args) {
		contaEspecial conta1= new contaEspecial(1454,"09800404",1000.0);
		Scanner leia = new Scanner(System.in);
		
		System.out.println(conta1.debito(50));
		
		
		
	}

}
