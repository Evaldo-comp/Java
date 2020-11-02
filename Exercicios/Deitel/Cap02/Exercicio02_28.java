/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* 	Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
*   circunferência e área utilizando o valor do ponto flutuante 3,14159 para S .
*
* Solução by @evaldo )3/ Ago/2020
*
*************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_28{

	public static void main(String[] args) 
	{

		
		Scanner input = new Scanner(System.in);
		int raio, n2, n3, maior, menor;

		System.out.println("Entre com valor do raio");
		raio = input.nextInt();

		System.out.printf("O diâmetro do circulo é %d%n", (2*raio));
		System.out.printf("O valor da circunferência é %.2f%n", (2*(Math.PI *raio)));
		System.out.printf("A área do círculo é %.2f%n", (Math.PI *raio) * (Math.PI *raio) );
			

		
		 
	

		
	}
}
