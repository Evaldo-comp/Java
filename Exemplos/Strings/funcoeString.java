/**
* 
*
*   1 - Convertendo uma String para minúscula- toLowerCase()
*
*   2 - Convertendo uma String para MAIÚSCULA- uperCase()
*
*   3 - Eliminando espaços desnecessários das strings - .trim()
*
*   4 - Gerando uma nova String a partir de um recorte - substring(inicio do corte, fim do corte)
*	    pode-se optar por fornecer apenas o início do corte.
*
*	5 - Retornar o valor do indice onde ocore a primeira aparição de determinado trecho ou caractere -indexOf()
*
*	6 - Retornar o valor do indice onde ocore a última aparição determinado trecho ou caractere -LastindexOf()
*
*	7 - Recortando uma string na ocorência de algum elemento de sua escolha - split()
*
*
*   8 - Trocando um caractere por outro - replace('a', 'b')
 */
import java.util.Scanner;
public class funcoeString
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String teste ="aaa BBBB cccc  ";
		String frase;

		// Coletando dados do usuário
		System.out.println("Digite uma frase");
		frase = input.nextLine();


		//Manipulação de Strings fornecidas pelo usuário
		String toMin = frase.toLowerCase(); //Atribui a frase em caixa baixa a uma nova variável
		String toMai = frase.toUpperCase(); //Atribui a frase em caixa Alta a uma nova variável
		String noSpace = frase.trim(); // Retira espaços
		String corte = frase.substring(3); //Gera uma nova String a partir do índice 3
		String troca = frase.replace('a', 'K'); // Troca toda ocorrência de 'a por 'K'
		int primeiro = frase.indexOf('a'); // Retorna o indice onde 'a' aparece pela primeira vez
		int ultimo = frase.lastIndexOf('a'); // Retorna o'índice onde 'a' aparece pela última vez
		String [] Extvect = frase.split(" "); // Corta a String a cada ocorrência de espaço
		
		// Manipulação de Strings pre-Determinadas
		String testeLower = teste.toLowerCase();
		String testeUpper  = teste.toUpperCase();
		String testeNoSpace = teste.trim();
		String testeCorte = teste.substring(3);
		String testeTroca = teste.replace(' ', '_');
		int testePrimeiro = teste.indexOf('a');
		int testeUltimo = teste.lastIndexOf('a');
		String [] Intvect = teste.split(" ");
		


		// Impressão dos resultados		

		// Minúsculas
		System.out.println("Minúscula Externa: " + toMin);
		System.out.println( "Minúscula Interna: " + testeLower);


		System.out.println("\n");

		//Maiúsculas
		System.out.println("Maiúscula Externa: " + toMai);
		System.out.println( "Maiúscula Interna: " + testeUpper);

		System.out.println("\n");

		// Sem Espaços
		System.out.println("Externa sem Espaços: -" + noSpace + "-");
		System.out.println( "Interna sem Espaços -" + testeNoSpace + "-");


		System.out.println("\n");

		// Recorte
		System.out.println("Recorte da String Externa: -" + corte + "-");
		System.out.println( "Recorte da String Interna -" + testeCorte + "-");

		System.out.println("\n");

		// Replace
		System.out.println("Troca da String Externa: -" + troca + "-");
		System.out.println( "Troca da String Interna -" + testeTroca + "-");


		System.out.println("\n");

		// index e lastIndex
		System.out.printf("Externa - Primeira ocorrência de a foi no índice %d:%n", primeiro);
		System.out.printf("Externa - última ocorrência de a foi no índice %d:%n", ultimo);
		System.out.printf("Interna - Primeira ocorrência de a foi no índice %d:%n", testePrimeiro);
		System.out.printf("Interna - última ocorrência de a foi no índice %d:%n", testeUltimo);		

		System.out.println("\n");

		// Split
		System.out.printf("Externa: Palavra 01 (%s) - Palavra 02 (%s) - Palavra 03 (%s) %n", Extvect[0], Extvect[1], Extvect[2]);
		System.out.printf("Interna: Palavra 01 (%s) - Palavra 02 (%s) - Palavra 03 (%s) %n", Intvect[0], Intvect[1], Intvect[2]);




	} // fim do método main
} 