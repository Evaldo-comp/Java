package Cap04;
import java.util.Scanner;
public class ComissaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comissao comiVendas = new Comissao();
		
		Scanner input = new Scanner(System.in);
		
		int item = 0;
		int quantidade = 0;
		float valorTotal = 0;
		
		while (true) {
			System.out.println("Insira o item vendido ou -1 para sair");
			item = input.nextInt();
			
			if (item == -1) {
				break;
			}
			System.out.println("Insira a quantidade vendida ");
			quantidade = input.nextInt();
			
			if (item == 1) {
				valorTotal += quantidade * 239.99;
			}else if (item == 2) {
				valorTotal += quantidade * 129.75;
			}else if (item == 3) {
				valorTotal += quantidade * 99.95;
			}else {
				System.out.println("Item inválido, insira uma valor de 1 a 4 ou -1 para sair");
			}
			
			comiVendas.setVendaSemana(valorTotal);
		}
		
		System.out.printf("Você reberá o total de R$ %.2f Reais",comiVendas.getSalarioSemana());
	}

}
