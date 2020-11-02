package Exemplos_cap04;

import java.util.Scanner;

public class MediaClass {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//inicialização das variáveis
		int total = 0;
		int contadorNotas = 1;
		
		// fase de processamento
		while (contadorNotas <=10) {
			System.out.print("Entre com a nota");
			int nota = input.nextInt();
			total+= nota;
			contadorNotas++;
		}
		
		int media = total/10;
		
		System.out.printf("%nTotal das 10 notas é %d%n", total);
		System.out.printf("Média da classe é %d%n", media);
		
		
	}

}
