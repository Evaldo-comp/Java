/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir:
* a) Declare que um programa calculará o produto de três inteiros.
* b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
* c) Declare as variáveis x , y , z e result como tipo int .
* d) Solicite que o usuário insira o primeiro inteiro.
* e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x .
* f) Solicite que o usuário insira o segundo inteiro.
* g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y .
* h) Solicite que o usuário insira o terceiro inteiro.
* i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z .
* j) Compute o produto dos três inteiros contidos nas variáveis x , y e z e atribua o resultado à variável result .
* k) Use System.out.printf para exibir a mensagem “Product is ” seguida pelo valor da variável result.
*
*Solução by @evaldo 27/jul/2020
*
*************************************************************************************************************/
import java.util.Scanner;
// item a
// Esse programa irá calcular o produto de três números inteiros -
public class Exercicio02_05{

	public static void main(String[] args) 
	{

		// item b
		Scanner input = new Scanner(System.in);

		int x, y, z, result; //  item c

		// item d
		System.out.println("Digite o primeiro número");
		x = input.nextInt(); // item e

		// item f
		System.out.println("Digite o segundo número");
		y = input.nextInt(); // item g

		// item h
		System.out.println("Digite o terceiro número");
		z = input.nextInt(); // item i

		// item j
		result = x * y * z ;

		// item k
		System.out.printf("Product is %d%n", result);


		
	
	}

}