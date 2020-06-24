
/**
 * Adaptado do livro - Java, como Programar 10 ed (Paul Deitel e Harvey Deitel)
 * @evaldo 24/06/2020 
 *
 *(Aritmética) Escreva um programa que solicite ao usuário inserir dois inteiros, obtenha dele esses 
 * números e imprima sua soma, produto, diferença e quociente (divisão). 
 */
import java.util.Scanner; //importa a classe Scanner para a captura de dados do usuário

public class exe1
{
// método main inicia a execução do aplicativo Java
	public static void main(String[] args)
	{
		//cria um scanner para receber dados a partir do terminal
		Scanner input = new Scanner(System.in);

		int numero1;
		int numero2;
		int soma, produto, diferenca, quociente, resto; 

		System.out.print("Digite o primeiro número: ");//Mensagem no terminal
		numero1 = input.nextInt(); //Lê o primeiro número

		System.out.print("Digite o segundo número: ");//Mensagem no terminal
		numero2 = input.nextInt(); //Lê o segundo número

		soma = numero1 + numero2; //realiza a soma

		produto = numero1 * numero2; // realiza a multiplicação

		diferenca = numero1 - numero2; //realiza a subtração

		quociente = numero1 / numero2; // realiza a divisão

		resto = numero1 % numero2; 

		System.out.printf("A soma é %d%n", soma);
		System.out.printf("O produto  é %d%n", produto);
		System.out.printf("A diferença é %d%n", diferenca);
		System.out.printf("O quociente  é %d e o resto é %d%n", quociente, resto);



	} // fim do método main
} // fim da classe exe01