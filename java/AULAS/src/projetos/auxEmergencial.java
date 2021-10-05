package projetos;

import java.util.Scanner;

public class auxEmergencial {
	public static void main(String[] args) {
		
	
	
	Scanner leia = new Scanner(System.in);
	
	int auxilio= 600;
	String nome,pronome;
	char outroAuxilio,op;
	boolean chefaDeFamilia=false,filhosAcimade0,outroAux;
	int numFilhos=0; 
	
	
	System.out.println("Qual o seu nome: ");
	nome = leia.next();
	
	System.out.println("Você é chefa de família? Se sim, escreva (S):");
	op = leia.next().charAt(0);
	if (op=='S') {
		chefaDeFamilia=true;
	} 
		
	
	System.out.println("Quantos filhos você tem? ");
	numFilhos = leia.nextInt();
	if (numFilhos>0); {
		filhosAcimade0=true;
	}
	
	
	System.out.println("Você recebe outro auxílio: S/N ");
	outroAuxilio = leia.next().charAt(0);
	if (outroAuxilio=='N') {
		outroAux=true;
		
		
	 
		if (chefaDeFamilia && outroAux) {
		 if (filhosAcimade0) {
			auxilio=(auxilio*2)+(numFilhos*50);
			System.out.println("Olá "+nome+". Seu auxílio é de R$"+auxilio);
		} else  {
			auxilio=auxilio*2;
			System.out.println("Olá "+nome+". Seu auxílio é de R$"+auxilio);
		}
		}
		else  {
			System.out.println("Olá "+nome+". Seu auxílio é de R$"+auxilio);
			
		}
		
		
			
	} else  {
		System.out.println("Você não tem direito ao auxílio.");
		
	}
	

	}
}
		
	