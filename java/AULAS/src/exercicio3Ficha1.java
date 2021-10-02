import java.util.Scanner;

/*programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos
		escreva("Quantos segundos durou o evento na fábrica?")
		leia (segundos)

		horas = segundos/3600
		minutos = (segundos%3600)/60
		segundos = (segundos%3600)%60

	escreva("Seu evento durou ",horas," horas e ",minutos," minutos e ",segundos," segundos.")
	}
} */
public class exercicio3Ficha1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int horas, minutos, segundos;
		System.out.println("Quantos segundos duraram o evento na fábrica?");
		segundos = leia.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		System.out.println("Seu evento durou "+horas+" horas e "+minutos+" minutos e "+segundos+" segundos");
		
		
	}
}
