package cap04;

import java.util.Scanner;

/*
 * (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do 
 * Exercício 4.21, encontre os dois maiores valores entre os 10 valores inseridos. 
 * [Observação: você só pode inserir cada número uma vez.]
 */
public class Exercicio04_23 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int count = 1, n, maior =0, maior2 = 0;
		 
		 while(count <= 10) {
			 System.out.println("Digite um número");
			 n = input.nextInt();
			 if (n > maior) {
				 maior2 = maior;
				 maior  = n;
			
			 }
			 count += 1;
		 }
		 System.out.printf("O primerio maior número é %d e o segundo é %d", maior, maior2);

	}

}
