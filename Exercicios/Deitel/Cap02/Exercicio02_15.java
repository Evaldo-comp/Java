/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses 
* números e imprima sua soma, produto, diferença e quociente (divisão). 
*
* Solução by @evaldo 27/jul/2020
*
*************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_15{

	public static void main(String[] args) 
	{

		// item b
		Scanner input = new Scanner(System.in);
		int n1, n2;
			

		System.out.println("Insira o primeiro número"); //item a
		n1 = input.nextInt();

		System.out.println("Insira o segundo número"); //item a
		n2 = input.nextInt();

		System.out.printf("A soma é :%d%n ", (n1+n2) );
		System.out.printf("O produto é :%d%n ", (n1*n2) );
		System.out.printf("A Diferença é :%d%n ", (n1-n2) );
		System.out.printf("O quociente é :%d%n ", (n1/n2) );
		


		

		


		
	
	}

}