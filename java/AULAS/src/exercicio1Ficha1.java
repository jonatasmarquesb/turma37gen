import java.util.Scanner;

/*programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias
		escreva("Quantos anos você tem?")
		leia (anos)

		escreva(" e quantos meses?")
		leia (meses)

		escreva("e quantos dias?")
		leia (dias)

		dias = anos*365 + meses*30 + dias

		escreva("Você viveu ",dias," dias.")
	}
}*/




public class exercicio1Ficha1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias;
		
		
		System.out.println("Quantos anos você tem?");
		anos = leia.nextInt();
		
		System.out.println("E quantos meses?");
		meses = leia.nextInt();
		
		System.out.println("Quantos dias?");
		dias = leia.nextInt();
				
		dias = (anos*365) + (meses*30) + dias;
		
		System.out.printf("Você viveu "+dias+" dias.");
		
		
	}

}
