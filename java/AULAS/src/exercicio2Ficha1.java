import java.util.Scanner;

/*programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anos, meses, dias
		
		escreva("Qual seu nome: ")
		leia (nome)
		escreva("Qual a sua idade em dias: ")
		leia(dias)

		anos = dias/365
		meses = (dias%365)/30
		dias = (dias%365)%30

		escreva("Olá ",nome,". Você tem ",anos," anos, ",meses," meses e ",dias," dias")
		
	}
}*/
public class exercicio2Ficha1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int anos, meses, dias;
		
		System.out.println("Qual o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Qual sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = dias/365;
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		
		System.out.println("Olá "+nome+". Você tem "+anos+" anos, "+meses+" meses e "+dias+" dias.");
		
	}
}
