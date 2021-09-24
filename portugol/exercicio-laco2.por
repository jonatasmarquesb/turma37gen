programa
{
	
	funcao inicio()
	{
		const real SALARIOHORA=10
		const real HORAEXTRA=20
		const real SALARIOFIXO=500
		
		cadeia codigoTrabalhador
		inteiro horasTrabalhadas
		real horasExcedidas
		real salarioExtra
		real salarioTotal

 		escreva("Insira aqui o código do funcionário:")
 		leia (codigoTrabalhador)
 		escreva ("Insira a quantidade de horas trabalhadas pelo funcionário no mês:")
 		leia (horasTrabalhadas)
 		limpa()

 		se (horasTrabalhadas>50) {
 			horasExcedidas= horasTrabalhadas - 50
 			salarioExtra = horasExcedidas * HORAEXTRA
 			salarioTotal = SALARIOFIXO + salarioExtra

 			escreva("O trabalhador de código: ",codigoTrabalhador,".\n Receberá um salário total de R$",salarioTotal,".\n Foram adicionados R$",salarioExtra," em horas extras.")
 		}
 		senao se (horasTrabalhadas<=50) {
 			salarioTotal = horasTrabalhadas * SALARIOHORA
			escreva("O trabalhador de código: ",codigoTrabalhador,".\n Reberá um salário total de R$",salarioTotal," com base em suas horas trabalhadas.")
 		}
 		
 		
 		
 			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 970; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */