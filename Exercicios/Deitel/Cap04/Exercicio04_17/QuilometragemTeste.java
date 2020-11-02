
import java.util.Scanner;
public class QuilometragemTeste {


	public static void  main (String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float quilporlitro;
		int quilTotal = 0, litTotal = 0;
		
		Quilometragem dados = new Quilometragem();
		int quil = 0;
		
		while (true) {
			
		System.out.println("Insira quantidade de quilomentros, ou -1 para sair: ");
		quil = input.nextInt();
		dados.setQuilometros(quil);
		
		if (quil == -1) {
			break;
		}
		
		
		System.out.println("Insira quantidade de Litros: ");
		int litros = input.nextInt();
		dados.setLitros(litros);
		
		quilporlitro = quil/litros;
		
		System.out.printf("Você consumiu até aqui %.2f quilômetros por litro%n", dados.getQuilPorLittro());
		
		quilTotal += quil;
		dados.setQuilTotal(quilTotal);
		
		litTotal+= litros;
		dados.setLitTotal(litTotal);
		
		System.out.printf("Sua quilemtragem total até aqui é de %d litros e %d quilomentros%n", dados.getQuilTotal(),dados.getLitTotal());

		
		
		}
	}

}
