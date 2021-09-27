programa
{
	
	funcao inicio()
	{
		cadeia time1 = "SPORT     "
		cadeia time2 = "SANTA CRUZ"
		cadeia time3 = "NAUTICO   "
		caracter op
		inteiro ponto1=0,ponto2=0,ponto3=0
		inteiro y

		para (y = 1; y<=3; y++) {
			escreva(time1+" Digite g-ganhou, e-empatou ou p-perdeu:")
			leia (op)
			escreva ("\n")
			se (op=='g') {
				ponto1 += 3
			}
			senao se (op=='e') {
				ponto1 += 1
			}
			senao {
				ponto1 += 0
			}
			escreva(time2+" Digite g-ganhou, e-empatou ou p-perdeu:")
			leia (op)
			escreva ("\n")
			se (op=='g') {
				ponto2 += 3
			}
			senao se (op=='e') {
				ponto2 += 1
			}
			senao {
				ponto2 += 0
			}
			escreva(time3+" Digite g-ganhou, e-empatou ou p-perdeu:")
			leia (op)
			escreva ("\n")
			se (op=='g') {
				ponto3 += 3
			}
			senao se (op=='e') {
				ponto3 += 1
			}
			senao {
				ponto3 += 0
			}
		}
		escreva("TABELA\n")
		escreva(time1+"\t"+ponto1+"\n")
		escreva(time2+"\t"+ponto2+"\n")
		escreva(time3+"\t"+ponto3+"\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */