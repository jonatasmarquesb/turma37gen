programa
{
	
	funcao inicio()
	{
		real totalSomatorio=0.00
		inteiro x =0
		inteiro contador=0
		real mediaValores=0.00
		inteiro totalValoresLidos=0

	
		
			
			
		enquanto (x>=0) {
			
			escreva("Insira um numéro: ")
			leia(x)

			se (x>=0) {
				contador++
				totalSomatorio += x
				totalValoresLidos = contador		
		
				mediaValores = totalSomatorio/totalValoresLidos
			}

			se (x<0){
				escreva("\nSomatório de valores inseridos: ",totalSomatorio)
				escreva ("\nMédia dos valores inseridos: ",mediaValores)
				escreva("\nQuantos números foram inseridos: ",totalValoresLidos)
				escreva("\nfim do programa!")
			}
			
			
			}

		
		

	


		
		

		}

		
			
		
			

		
		
		
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */