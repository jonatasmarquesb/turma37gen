package br.com.ecommerce;

import br.com.ecommerce.classes.Produto;
import br.com.ecommerce.utilidades.MetodosUteis;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	double totalPagar=0.0;
		double imposto=0.0;
		int opcaoPag=0;
		double parcelas=0.0;
		int quantidadeSelecionada=0;

        MetodosUteis objMetodosUteis = new MetodosUteis(); //Cria uma instância da classe métodos uteis para usar vários métodos que ajudará no trabalho
        Scanner leitor = new Scanner(System.in); //Cria o Scanner para realizar interação com o usuário durante a compra

        //Chama o método pegarListaProdutos para preencher nossa lista de produtos do ecommerce
        ArrayList<Produto> listaProdutos = objMetodosUteis.pegarListaProdutos();

        //Cria a lista do carrinho de compras vazia para ir adicionando os produtos a medida que for comprando
        ArrayList<Produto> listaCarrinhoComrpas = new ArrayList<>();

        //Controla se o laço de repeditção deve ou não continuar com a compra
        int continuarCompras = 1;

        //Repete o processo de compra enquanto o usuário desejar continuar a compra
        do{

            objMetodosUteis.imprimirTabelaDeProdutos(listaProdutos);

            System.out.print("\nDigite o código do produto que você deseja comprar: ");
            String codigoProdutoSelecionado = leitor.next().toUpperCase();

            //Faz a busca do produto usando o metodo buscaProdutoPorCodigo
            Produto produtoSelecionado = objMetodosUteis.buscaProdutoPorCodigo(codigoProdutoSelecionado, listaProdutos);

            //Se o valor do produtoSelecionado retornado da busca for NULL, ele exibe a mensagem dizendo que o produto não foi encontrado se for um produto válido faz o processo de compra no carrinho
            if(produtoSelecionado != null){

                System.out.printf("\nProduto selecionado foi:\n %s \n", produtoSelecionado.toString());
                System.out.printf("\nInforme a quantidade que deseja comprar: ");
                 quantidadeSelecionada = leitor.nextInt();

                //Valida a baixa de estoque, porque não pode comprar mais unidades do que a quantidade que se tem no estoque
                if(quantidadeSelecionada <= produtoSelecionado.getQuantidade()){

                    int resultadoBaixaEstoque = (produtoSelecionado.getQuantidade() - quantidadeSelecionada);//Realiza o calculo da baixa do estoque
                    produtoSelecionado.setQuantidade(resultadoBaixaEstoque); //Atualiza o produto selecionado com o novo estoque

                    //Adicona o produto seleciona ao carrinho de compras com a quantidade informada
                    listaCarrinhoComrpas.add(new Produto(
                            produtoSelecionado.getCodigo(),
                            produtoSelecionado.getNome(),
                            produtoSelecionado.getValor(),
                            quantidadeSelecionada
                    ));

                    System.out.printf("\nProduto %s foi adicionado ao carrinho de compras!", produtoSelecionado.getNome());

                }else {
                    System.out.printf("\nA quantidade informada é invalida, você deseja %d, mas nosso estoque contém apenas: %d para o produto %s",
                            quantidadeSelecionada,
                            produtoSelecionado.getQuantidade(),
                            produtoSelecionado.getNome());
                }

            }else {
                System.out.printf("\nNenhum produto foi encontrado com o código = %s", codigoProdutoSelecionado);
            }

            //Pergunta se deseja continuar comprando ou não
            System.out.println("\nDeseja continuar comprando? [1 = SIM / 2 = NAO]");
            continuarCompras = leitor .nextInt();

        }while(continuarCompras == 1);

        //Imprime o resumo total da compra
        System.out.print("\nResumo total da compra:\n ITENS SELCIONADOS:\n");

        for (Produto produto : listaCarrinhoComrpas) {
            System.out.println(produto.toString());
        }

        double valorTotal = objMetodosUteis.calcularValorTotalCompra(listaCarrinhoComrpas);
        valorTotal = valorTotal*quantidadeSelecionada;
        System.out.printf("\nO valor total da compra é de: R$ %.2f", valorTotal);
        imposto = valorTotal * 0.09;
        
        
        
        System.out.println("\nDIGITE SUA OP��O DE PAGAMENTO:\n");
        System.out.println("1- A VISTA (10% DESCONTO) | 2 - CART�O (10% ACR�SCIMO) | 3 - DUAS VEZES NO CART�O (15% ACR�SCIMO)");
        opcaoPag = leitor.nextInt();
        if (opcaoPag==1) {
        	valorTotal= valorTotal - (valorTotal*0.1);
        	System.out.println("\n------------NOTA FISCAL-----------\n");
        	
        	System.out.println("Total pago: R$"+valorTotal);
        	System.out.println("9% de impostos sob o produto: R$ "+imposto);
        	System.out.println("\n Obrigado e volte sempre!!!");
        	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else if (opcaoPag==2) {
        	valorTotal= valorTotal + (valorTotal*0.1);
        	System.out.println("\n------------NOTA FISCAL-----------\n");
        	
        	System.out.println("Total pago: R$"+valorTotal);
        	System.out.println("9% de impostos sob o produto: R$ "+imposto);
        	System.out.println("\n Obrigado e volte sempre!!!");
        	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else if (opcaoPag==3) {
        	valorTotal =valorTotal + (valorTotal*0.15);
        	parcelas = valorTotal/2;
        	System.out.println("\n------------NOTA FISCAL-----------\n");
        	
        	System.out.println("Total pago: R$"+valorTotal);
        	System.out.println("Valor das parcelas (Dividido em duas vezes): R$"+parcelas);
        	System.out.println("9% de impostos sob o produto: R$ "+imposto);
        	System.out.println("\n Obrigado e volte sempre!!!");
        	new Thread();
        	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

    }

}
