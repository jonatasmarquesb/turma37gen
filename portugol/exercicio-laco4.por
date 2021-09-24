programa{
  
  funcao inicio(){
    
    inteiro num
    
    escreva("Diga um número: ")
    leia(num)

    se (num>0) {

    
    		se(num % 2 == 1){
      	escreva(num," é Ímpar e positivo.\n")
    		}
    		senao{
      	escreva(num," é Par e positivo.\n")
    		}
    }
    senao se (num<0) {
    		se(num % -2 == -1) {
    			escreva(num," é ímpar e negativo.\n")
    			    		}
    		senao{
    			escreva(num," é par e negativo.\n")
    		}
    }

    
    }
  }


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */