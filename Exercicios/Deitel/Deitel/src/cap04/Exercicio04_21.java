package cap04;

import java.util.Scanner;
/*
 * (Localize o maior número) O processo de localizar o maior valor é muito utilizado em 
 * aplicativos de computador. Por exemplo, um programa que determina o vencedor de uma 
 * competição de vendas inseriria o número de unidades vendidas por cada vendedor. 
 * O vendedor que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo
 * e,  então, um aplicativo Java que aceita como entrada uma série de 10 inteiros e determina
 * e imprime o maior dos inteiros.
 */

public class Exercicio04_21 {
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int count = 1, n = 0, maior = 0;
		
		while(count <= 10) {
			System.out.println("Digite um número");
			n = input.nextInt();
			if (maior < n) {
				maior = n;
				System.out.printf("O maior número é %d", maior);
			}
			count += 1;
		}
		System.out.printf("O maior dos números é %d", maior);

	}

}
