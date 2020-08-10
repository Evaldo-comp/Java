// Operadores de comparação
// Fazendo uso de operadores de igualdade e relacionais, compara dois números inteiros

import java.util.Scanner;


/**
 * Adaptado do livro - Java, como Programar 10 ed (Paul Deitel e Harvey Deitel)
 * @evaldo 24/06/2020 
 *
 *Realiza a comparação de inteiros com operadores
 */


public class OperadoresComparacao
{
// método main inicia a execução do aplicativo Java
	public static void main(String[] args)
	{
		//cria um objeto scanner para receber dados a partir do terminal
		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;
		

		System.out.print("Digite o primeiro número: ");//Mensagem no terminal
		numero1 = input.nextInt(); //Lê o primeiro número

		System.out.print("Digite o segundo número: ");//Mensagem no terminal
		numero2 = input.nextInt(); //Lê o segundo número

		if (numero1 == numero2)
			System.out.printf("%d == %d%n", numero1,numero2);

		if (numero1 != numero2)
			System.out.printf("%d != %d%n", numero1,numero2);


		if (numero1 < numero2)
			System.out.printf("%d < %d%n", numero1,numero2);


		if (numero1 > numero2)
			System.out.printf("%d > %d%n", numero1,numero2);


		if (numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1,numero2);


		if (numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1,numero2);



	} // Fim do método main
} // Fim da classe OperadoresComparacao