programa
{
	
	funcao inicio()
	{
		cadeia codigo[] = {"G4-1","G4-2","G4-3","G4-4","G4-5","G4-6","G4-7","G4-8","G4-9","G4-10"}
		cadeia produto[] = {"teclado        ","mouse        ","cadeira        ","gabinetes        ","memoria ram        ","monitor        ","headset        ","suporte notebook        ","mousepad        ","notebook        "}
		real valor[] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}
		inteiro estoque[] = {10,10,10,10,10,10,10,10,10,10}
		caracter desejo = ' '
		
		escreva("NOME DA LOJA \n")
		escreva("SLOGAN DA LOJA \n")
		escreva("")

		escreva("Deseja fazer compras? S/N ")
        		leia(desejo)

				
		se (desejo == 'S' ou desejo == 's'){
				escreva("LISTA DE PRODUTOS\n")
				para (inteiro i = 0; i <= 10; i++){
					escreva(codigo[i],"\t", produto[i],"         \t R$", valor[i],"\t", estoque[i], "\t\n")
					
				}
				
			}
		senao se (desejo == 'N' ou desejo == 'n') {
				limpa()
				escreva("Obrigado, volte sempre!")
				
			}
			
			}
		
			
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */