/**
 * Adaptado do livro - Java, como Programar 10 ed (Paul Deitel e Harvey Deitel)
 * @evaldo 24/06/2020 
 *
 *Imprimindo uma linha de texto com múltiplas instruções.
 */

public class BemVindo
{
// método main inicia a execução do aplicativo Java
	public static void main(String[] args)
	{
		System.out.print("Welcome to ");
		System.out.println("Java Programming!");

		System.out.println("Esta linha está \n utilizando\n scape para saltar de linha");// Utilizando scape

		System.out.printf("%s%n%s%n", "O printf", "Exibe dados formatados");
		// %s e %n são especificadores de formato:
		//%s define o lugar de uma string
		//%n define que deverá saltar uma linha

		//OBS: Não confundir scape  \n com especificador %n 


	} // fim do método main
} // fim da classe Welcome2