programa
{
	
	funcao inicio()
	{
		inteiro idade=0,contador=0
		cadeia countries

			para(inteiro x=0;x<3;x++) {
			escreva("Qual seu país? BR, POR ou USA\n")
			leia (countries)
			
			se (countries=="USA") {
				contador++
				escreva("What is your age?\n") }
			senao {
				escreva("Qual sua idade?\n")				
			}
			leia (idade)

	
			se ((countries == "BR" e idade>=18) ou (countries=="USA" e idade>=21) ou (countries=="POR")) {
				escreva ("Acess allowed / Acesso permitido.") 
				limpa()}
			senao {
				escreva("\nAcess denied / Acesso negado.") 
				limpa()
			}
			}
			escreva("\nO número de usuários dos EUA foram: ",contador)
				 	
			}
		}
		
		


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */