/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* Escreva instruções para realizar cada uma das tarefas a seguir:
* a- Declare que as variáveis c , thisIsAVariable , q76354 e number serão do tipo int .
* b - Solicite que o usuário insira um inteiro.
* c - Insira um inteiro e atribua o resultado à variável int value . Suponha que a variável Scanner input 
* 	  possa ser utilizada para ler um valor digitado pelo usuário.
* d - Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println .
* e - Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java . 
*	  Utilize o método System.out.printf e dois especificadores de formato %s .
* f- Se a variável number não for igual a 7 , exiba “The variable number is not equal to 7" .
*
*Solução by @evaldo 27/jul/2020
*
*************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_03{

	public static void main(String[] args) 
	{

		int c, thisIsAVariable, q76354, number; // Solução do item a

		Scanner input = new Scanner(System.in);

		// Solução do item b
		System.out.print("Digite um número");
		number = input.nextInt();


		// Solução do item c
		int value; // variavel solicitada no item c
		System.out.print("Digite um número");
		value = input.nextInt();

		//Solução do item s
		System.out.println("This is a Java Program");

		// Solução do item e
		String trecho1 = "This is a Java";	
		String trecho2 = "Program";

		System.out.printf("%s%n%s%n",trecho1, trecho2);

	
	}

}