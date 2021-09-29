/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

programa
{
	inclua biblioteca Util --> mat
	
	funcao inicio()
	{
		inteiro lancamentos[10], maiorPontuacao=0,contador=0
		real totalLancamentos=0.00

		para (inteiro x=0; x<10; x++){
			lancamentos[x] = mat.sorteia(1, 6)
			totalLancamentos += lancamentos[x]
			se (lancamentos[x]>maiorPontuacao) {
				maiorPontuacao = lancamentos[x]
				
			}
		}
		para (inteiro x=0; x<10; x++) {
			escreva("A jogada ",x+1," foi: ",lancamentos[x],"\n")
			se (lancamentos[x]==maiorPontuacao){
				contador++
			}
		}
		escreva("\nA média aritmética dos lançamentos foi: ",(totalLancamentos/10),"\n")
		escreva("\nA maior pontuação foi: ",maiorPontuacao,". E a ocorrência dela foram ",contador," vezes.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 440; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */