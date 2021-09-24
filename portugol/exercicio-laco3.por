/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados. */

programa
{
	
	funcao inicio()
	{
		inteiro A, B, C, D
		
		escreva ("Escreva o número A:")
		leia(A)
		escreva ("Escreva o número B:")
		leia(B)
		escreva ("Escreva o número C:")
		leia(C)
		escreva ("Escreva o número D:")
		leia(D)

		A = A * A
		B = B * B
		C = C * C
		D = D * D 

		se (C>=1000) {
			escreva("C é igual a ",C,". Fim do programa.")
		}
		senao se (C<1000) {
			escreva ("O valor de A ao quadrado é: ",A,".\n O valor de B ao quadrado é: ",B,".\n O valor de C ao quadrado é :",C,".\n O valor de D ao quadrado é: ",D,".")
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */