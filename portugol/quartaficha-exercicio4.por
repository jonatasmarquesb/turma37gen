programa
{
	
	funcao inicio()
	{
	inteiro matriz[3][3], linha, coluna,somaTotal=0,somaPrincipal=0

	para (linha=0; linha<3; linha++) {
		para (coluna=0; coluna<3; coluna++){
			escreva("VALOR: ")
			leia (matriz[linha][coluna])
			somaTotal += matriz[linha][coluna]
			se (linha==coluna) {
				somaPrincipal += matriz[linha][coluna]
			}
			
		}
	}
	para (linha=0; linha<3; linha++) {
		para (coluna=0; coluna<3; coluna++){
			escreva("[   ",matriz[linha][coluna],"  ]")
			
						
		}
		escreva("\n")	
	}
	escreva ("\n A soma total dos valores da matriz foi: ",somaTotal,"\n")
	escreva ("\n A soma da diagonal principal foi: ",somaPrincipal,"\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */