programa
{
	
inclua biblioteca Matematica --> math
	funcao inicio()
	{
		cadeia nome
		real farenheit,celsius, arredondado
		inteiro casas
		escreva ("Qual seu nome: ")
		leia (nome)
		escreva ("Qual a temperatura em F°: ")
		leia (farenheit)
		celsius = (farenheit-32)/1.8
		arredondado= math.arredondar(celsius, 1)
		escreva ("Ok, ",nome,". A temperatura em C° é de ",arredondado,"°")

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */