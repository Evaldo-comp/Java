/**
 * Adaptado do livro - Java, como Programar 10 ed (Paul Deitel e Harvey Deitel)
 * @evaldo 24/06/2020 
 *
 *Entrada de Dados
 *Programa que recebe dois números e devolve a soma de ambos
 */


import java.util.Scanner; //importa a classe Scanner para a captura de dados do usuário

public class EntradaDeDados
{
// método main inicia a execução do aplicativo Java
	public static void main(String[] args)
	{
		//cria um scanner para receber dados a partir do terminal
		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;
		int soma; 

		System.out.print("Digite o primeiro número: ");//Mensagem no terminal
		numero1 = input.nextInt(); //Lê o primeiro número

		System.out.print("Digite o segundo número: ");//Mensagem no terminal
		numero2 = input.nextInt(); //Lê o segundo número

		soma = numero1 + numero2; //realiza a soma 

		System.out.printf("A soma é %d%n", soma);



	} // fim do método main
} // fim da classe EntradaDeDados