/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar 
*	se o primeiro é um múltiplo do segundo e imprimir o resultado.
*
* Solução by @evaldo 03/ Ago/2020
*
*************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_26{

	public static void main(String[] args) 
	{

		
		Scanner input = new Scanner(System.in);
		int n1, n2;

		System.out.println("Digite o primeiro número");
		n1 = input.nextInt();

		System.out.println("Digite o segundo número");
		n2 = input.nextInt();

		if (n1%n2 == 0)
		{
			System.out.printf("O número %d é múltiplo do número %d%n", n1, n2);
		}else
		{
			System.out.printf("O número %d NÃO é múltiplo do número %d%n", n1, n2);
		}
			

		
		 
	

		
	}
}
