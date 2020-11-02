/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
*
*************************************************************************************************************/
import java.util.Scanner;

public class ContaTeste{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
		// Cria um objeto Conta e atribui a minhaConta

		Conta minhaConta = new Conta();

		// solicita  lê o nome
		System.out.println("Entre com seu nome");
		String name = input.nextLine(); // Lê ma linha do texto
		minhaConta.setName(name);
		System.out.println(); // gera saída de uma linha em branco
		

		// solicita  lê a idade
		System.out.println("Entre com sua idade");
		int idade = input.nextInt(); 
		minhaConta.setAge(idade);
		System.out.println(); // gera saída de uma linha em branco


		// solicita  lê o gênero
		System.out.println("Entre com seu Gẽnero(M) mas culino - (F) Feminino - (O) Outro");
		String genero = input.next(); 
		minhaConta.setGen(genero);
		System.out.println(); // gera saída de uma linha em branco



		// imprime tudo na tela
		System.out.printf("O nome é: %s%n", minhaConta.getName());
		System.out.printf("a idade é: %d%n", minhaConta.getAge());
		System.out.printf("O Gênero é: %s%n", minhaConta.getGen());
		


		
	
	}

}