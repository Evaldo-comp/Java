/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* 	(Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, 
*	além de determinar e imprimir o maior e o menor inteiro no grupo. 
*	Utilize somente as técnicas de programação que você aprendeu neste capítulo.
*
* Solução by @evaldo 03/ Ago/2020
*
*************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_24{

	public static void main(String[] args) 
	{

		
		Scanner input = new Scanner(System.in);
		int n1, n2, n3,n4, n5, maior= 0, menor=0;

		System.out.println("Digite o primeiro número");
		n1 = input.nextInt();

		System.out.println("Digite o segundo número");
		n2 = input.nextInt();

		System.out.println("Digite o terceiro número");
		n3 = input.nextInt();

		System.out.println("Digite o quarto número");
		n4 = input.nextInt();

		System.out.println("Digite o quinto número");
		n5 = input.nextInt();
			


		//Definição do maior
		if ((n1 > n2) && (n1 > n3)&&(n1 > n4)&&(n1 > n5))
		{
			maior = n1;
		}
		else if ((n2 > n1) && (n2 > n3)&&(n2 > n4)&&(n2 > n5))
		{
			maior = n2;
		}
		else if ((n3 > n1) && (n3 > n2)&&(n3 > n4)&&(n3 > n5))
	   {
			maior = n3;
		}
		else if ((n4 > n1) && (n4 > n2)&&(n4 > n3)&&(n4 > n5))
		{
			maior = n4;
		}
		else if ((n5 > n1) && (n5 > n2)&&(n5 > n3)&&(n5 > n4))
		{
			maior = n5;
		}
		
		

		//Definição do menor
		
		if ((n1 < n2) && (n1 < n3)&&(n1 < n4)&&(n1 < n5))
		{
			menor = n1;
		}
		else if ((n2 < n1) && (n2 < n3)&&(n2 < n4)&&(n2 < n5))
		{
			menor = n2;
		}
		else if ((n3 < n1) && (n3 < n2)&&(n3 < n4)&&(n3 < n5))
	   {
			menor = n3;
		}
		else if ((n4 < n1) && (n4 < n2)&&(n4 < n3)&&(n4 < n5))
		{
			menor = n4;
		}
		else if ((n5 < n1) && (n5 < n2)&&(n5 < n3)&&(n5 < n4))
		{
			menor = n5;
		} 
	

		
		System.out.printf("O maior número é %d e o menor é %d%n", maior, menor);
	}
}
