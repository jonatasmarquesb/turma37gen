package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produtos;

public class TesteLista {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		Produtos itens = new Produtos();
		String produtoSelecionado;
		int teste=0;
		int auxQtde=0;
		double totalPagar=0.0;
		double imposto=0.0;
		int opcaoPag=0;
		double parcelas=0.0;
		
		
		System.out.println();
		System.out.println("\ndevStore");
		System.out.println("A loja do desenvolvedore!");
		System.out.println();
		System.out.println("        PRODUTO  \tESTOQUE\t                VALOR\t        CÓDIGO");
		List<Produtos> listaProduto=  itens.preencherListaProduto();
		List<Produtos> carrinhoDeCompras=  itens.preencherCarrinhoDeCompras();
		
	
		for (Produtos produto: listaProduto) {
			
			System.out.println("\t"+produto.getNome()  + "   " + "\tQuantidade:" + produto.getQtde() + "    " + "\tPreço: " + produto.getPreco() + "\tcodigo: "+ produto.getCodigo() );
			
		}
		//System.out.println();
		System.out.print("Digite o código do produto que deseja: ");
		produtoSelecionado = leia.next().toUpperCase();
		
		System.out.println("\nCARRINHO DE COMPRAS:");
		//System.out.println();
		System.out.println("        PRODUTO  \tESTOQUE\t                VALOR\t        CÓDIGO");
		
		
		for (Produtos produto : listaProduto) {
			if(produtoSelecionado.equals(produto.getCodigo())) {
				carrinhoDeCompras.addAll(listaProduto);
				
				System.out.println("\t"+produto.getNome()  + "   " + "\tQuantidade:" + produto.getQtde() + "    " + "\tPreço: " + produto.getPreco() + "\tcodigo: "+ produto.getCodigo() );
			}
		}
		
		
		
	}
}
