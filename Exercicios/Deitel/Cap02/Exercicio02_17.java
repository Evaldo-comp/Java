/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* 	(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a 
*	soma, média, produto e os números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. 
*	[Observação: o cálculo da média neste exercício deve resultar em uma representação de inteiro. 
*	Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...].
*
* Solução by @evaldo 27/jul/2020
*
*************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_17{

	public static void main(String[] args) 
	{

		
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, maior, menor;
			

		System.out.println("Insira o primeiro número"); 
		n1 = input.nextInt();

		System.out.println("Insira o segundo número"); 
		n2 = input.nextInt();

		System.out.println("Insira o Terceiro número"); 
		n3 = input.nextInt();

		

		System.out.printf("A soma é: %d%n", n1+n2+n3);

		System.out.printf("A Média é: %d%n", (n1+n2+n3)/3);

		System.out.printf("O Produto  é: %d%n", n1*n2*n3);

		if ((n1>n2) && (n1 > n3))
		{
			maior = n1;
		}	
		else if ((n2>n1) && (n2 > n3))
		{
			maior = n2;
		}else{
			maior = n3;
		}



		if ((n1<n2) && (n1 < n3))
		{
			menor = n1;
		}	
		else if ((n2<n1) && (n2 < n3))
		{
			menor = n2;
		}else{
			menor = n3;
		}

	System.out.printf(" O maior número é %d e o menor é %d", maior, menor);
		 
	

		
	}
}
