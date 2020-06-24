/**
 * Adaptado do livro - Java, como Programar 10 ed (Paul Deitel e Harvey Deitel)
 * @evaldo 24/06/2020 
 *
 *Realiza a comparação de inteiros utilizando operadores
 */

import java.util.Scanner; //importa a classe Scanner para a captura de dados do usuário

public class CompInt
{
// método main inicia a execução do aplicativo Java
	public static void main(String[] args)
	{
		//cria um scanner para receber dados a partir do terminal
		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;

		

		System.out.printf("Digite o primerio número: ");
		numero1 = input.nextInt();

		System.out.printf("Digite o segundo número: ");
		numero2 = input.nextInt();
		
		if (numero1 > numero2)
			System.out.printf("%d é maior que %d%n", numero1, numero2);

		
		if(numero1 < numero2)
			System.out.printf("%d é menor que %d%n", numero1, numero2);

		if (numero1 == numero2)
			System.out.printf("%d é igual que %d%n", numero1, numero2);


	} // fim do método main
} // fim da classe CompInt