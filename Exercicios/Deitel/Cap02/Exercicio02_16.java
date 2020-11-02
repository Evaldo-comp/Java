/***********************************************************************************************************
*
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel 
*
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores
*
* (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses 
*  números e exiba o número maior seguido pelas palavras “is larger" . Se os números forem iguais, imprima a 
*  mensagem “These numbers are equal" .
*
* Solução by @evaldo 27/jul/2020
*
*************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_16{

	public static void main(String[] args) 
	{

		
		Scanner input = new Scanner(System.in);
		int n1, n2;
			

		System.out.println("Insira o primeiro número"); 
		n1 = input.nextInt();

		System.out.println("Insira o segundo número"); 
		n2 = input.nextInt();

		if(n1 > n2){
			System.out.printf("%d is larger", n1);
		}else if(n2 > n1) {
			System.out.printf("%d is larger", n2);

		}else{
			System.out.printf("These numbers are equal");
		}
	}

		
}
