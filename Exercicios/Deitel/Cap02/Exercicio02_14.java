/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço.
*  Use as seguintes
*	técnicas:
* a) Uma instrução System.out.println .
* b) Quatro instruções System.out.print .
* c) Uma instrução System.out.printf .

* Solução by @evaldo 27/jul/2020
*
*************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_14{

	public static void main(String[] args) 
	{

		// item b
		Scanner input = new Scanner(System.in);
		int n1 = 1,
			n2 = 2,
			n3 = 3,
			n4 = 4;

		System.out.println("1 2 3 4"); //item a

		//item b
		System.out.print(n1+ " " );
		System.out.print(n2+ " ");
		System.out.print(n3+ " ");
		System.out.print(n4+ " ");
		System.out.print("\n");

		//item c
		System.out.printf("%d %d %d %d%n ", n1, n2, n3, n4);

		


		
	
	}

}