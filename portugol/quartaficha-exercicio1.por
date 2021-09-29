programa
{
	
	funcao inicio()
	{
		inteiro num[4]
		inteiro maiorNum=0

		para (inteiro x = 0; x<=3; x++) {
			escreva("Digite uma pontuação ",x+1,": ")
			leia(num[x])

			se (num[x] > maiorNum) {
			maiorNum = num[x]
			}

		}
          escreva("\n------------------------------------------------")
		para (inteiro x = 0; x<=0; x++) {
			

			escreva("\nA maior pontuação é: ",maiorNum)
		}
		
		escreva("\n------------------------------------------------")
			
			
		
	
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */