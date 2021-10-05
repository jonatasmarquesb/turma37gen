import java.util.Locale;
import java.util.Scanner;

/*codigoProduto[3] = {"x01","x02","x03")
codigoProduto[] = {"x01","x02","x03")
nomeProduto[] = {"CALÇA","CAMISA","SAIA"}
valores[] = {100, 50, 70}
estoque[] = {20,20,20}
valores[] = {100.50, 50.75, 70.99}

*/
public class desafioLacosRepeticao {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String codigoProduto[] = {"X01","X02","X03"};//%s
		String nomeProduto[] = {"CALÇA","CAMISA","SAIA"};
		int estoque[] = {20,20,20};//%d
		double valorProduto[]= {100.50, 50.75, 70.99};//%f -> %.2f
		String auxCodigo;
		
		//MOSTRANDO NA TELA
		
		System.out.println("LOJA DA TURMA 37");
		System.out.println();
		System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
		for (int x=0; x<nomeProduto.length; x++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
		}
		
	}
}
