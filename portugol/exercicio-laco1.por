programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{
		real pesotomate, excesso, multa
		escreva("Insira o peso de tomates em kg:")
		leia (pesotomate)
		limpa()
		se (pesotomate>50) {
			excesso = pesotomate - 50
			multa = 4 * excesso
			excesso = math.arredondar(excesso, 2)
			multa = math.arredondar(multa, 2)
		
			escreva("Seu peso excedeu em ",excesso," kg, a multa será no valor de: R$ ",multa)
			
		}
		senao se (pesotomate<=50) {
			escreva("O peso de tomates está dentro dos limites")
		}
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */