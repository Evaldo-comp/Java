package cap04;

import java.util.Scanner;

/*
 * (Saída no formato de tabela) Escreva um aplicativo Java que utiliza um loop para imprimir 
 * a seguinte tabela de valores:
 * 
N   10*N 100*N 1000*N
1    10   100   1000
2    20   200   2000
3    30   300   3000
4    40   400   4000
5    50   500   5000
 */


public class Exercicio04_22 {

	public static void main(String[] args) {
		
		int N = 1;
		
		System.out.println("N     10*N    100*N    1000*N");
		
		while (N <= 5) {
			System.out.printf("%d     %d       %d      %d%n", N, N*10, N*100, N*1000);
			N +=1;
			
		}

	}

}
