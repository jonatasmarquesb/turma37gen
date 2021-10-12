package exercicio;
import java.util.Scanner;


public class devStore {
	
	public static void main(String[] args)  {
		@SuppressWarnings("unused")
		Thread timer = new Thread();
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		int estoque [] = {10,10,10,10,10,10,10,10,10,10};
		String nomeProduto[] = {"Teclado   ","Mouse   ","Cadeira   ","Gabinetes","Memoria ram","Monitor   ","Headset   ","SuporteNote","Mousepad","Notebook"};
		String codigoProduto[] = {"G4-1","G4-2","G4-3","G4-4","G4-5","G4-6","G4-7","G4-8","G4-9","G4-10"};
		
		double valorProduto[] = {40.0,20.0,500.0,400.0,45.0,600.0,40.0,80.0,10.0,2000.0};
		String auxCod;
		int teste=0;
		int auxQtde=0;
		
		double totalPagar=0.0;
		double imposto=0.0;
		int opcaoPag=0;
		double parcelas=0.0;
		while (true) {
		System.out.println();
		System.out.println("\ndevStore");
		System.out.println("A loja do desenvolvedore!");
		System.out.println();
		System.out.println("PRODUTO  \tCOD\tESTOQUE\tVALOR");
		
		for (int x=0; x < nomeProduto.length; x++) {
			System.out.println(nomeProduto[x]+"\t"+codigoProduto[x]+"\t"+estoque[x]+"\t"+valorProduto[x]);
		}
		System.out.println();
		System.out.print("Digite o código do produto que deseja: ");
		auxCod = leia.next().toUpperCase();
		
		System.out.println("\nCARRINHO DE COMPRAS:");
		System.out.println();
		System.out.println("PRODUTO  \tCOD\tESTOQUE\tVALOR");
		for (int y=0; y<nomeProduto.length; y++) {
			if (codigoProduto[y].equals(auxCod)) {
				System.out.println(nomeProduto[y]+"\t"+codigoProduto[y]+"\t"+estoque[y]+"\t"+valorProduto[y]);
				teste=y;
				break;
			} else {
					teste++;
				}
			
			
		}
		if (teste==nomeProduto.length) {
			System.out.println("Produto não encontrado.");
			
		}
		else {
			System.out.println("\nQuantos você deseja comprar? ");
			auxQtde = leia.nextInt();
				if (estoque[teste]==0) {
					System.out.println("Produto indisponível");
					
					}
				 else if (auxQtde>estoque[teste]) {
					System.out.println("Quantidade indisponível");
				
				}  else {
					totalPagar = auxQtde * valorProduto[teste];
	                System.out.println("Total a pagar: R$ " + totalPagar);
	                estoque[teste] -= auxQtde; 
	                imposto = totalPagar * 0.09;
	                
	                System.out.println("\nDIGITE SUA OPÇÃO DE PAGAMENTO:\n");
	                System.out.println("1- A VISTA (10% DESCONTO) | 2 - CARTÃO (10% ACRÉSCIMO) | 3 - DUAS VEZES NO CARTÃO (15% ACRÉSCIMO)");
	                opcaoPag = leia.nextInt();
	                if (opcaoPag==1) {
	                	totalPagar= totalPagar - (totalPagar*0.1);
	                	System.out.println("\n------------NOTA FISCAL-----------\n");
	                	System.out.println("Produto escolhido: "+nomeProduto[teste]+"| Quantidade: "+auxQtde);
	                	System.out.println("Total pago: R$"+totalPagar);
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
	                	totalPagar= totalPagar + (totalPagar*0.1);
	                	System.out.println("\n------------NOTA FISCAL-----------\n");
	                	System.out.println("Produto escolhido: "+nomeProduto[teste]+"| Quantidade: "+auxQtde);
	                	System.out.println("Total pago: R$"+totalPagar);
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
	                	totalPagar =totalPagar + (totalPagar*0.15);
	                	parcelas = totalPagar/2;
	                	System.out.println("\n------------NOTA FISCAL-----------\n");
	                	System.out.println("Produto escolhido: "+nomeProduto[teste]+"| Quantidade: "+auxQtde);
	                	System.out.println("Total pago: R$"+totalPagar);
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
		}
	}
	
	
	
}
