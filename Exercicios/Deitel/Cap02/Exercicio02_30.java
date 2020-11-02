/***********************************************************************************************************
*                                                                                                          *     
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel                                                    *
*                                                                                                          *
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores                               *
*                                                                                                          *
*	(Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco   *
*    dígitos a partir do usuário, separe o número em seus dígitos individuais e imprima os dígitos         *
*    separados uns dos outros por três espaços. Por exemplo, se o usuário digitar o número 42339 , o       *
*    programa deve imprimir                                                                                * 
*                                                                                                          *
* Solução by @evaldo                                                                         *
*                                                                                                          *
************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_30{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int numero;
		System.out.println("DIGITE UM NÚMERO DE 5 DIGITOS\n");
		numero = input.nextInt();
		int n1 = (numero /10000); //8765
		int n2 = (numero% 10000)/1000; //765
		int n3 = ((numero% 10000) % 1000) / 100; //65
		int n4 = (((numero% 10000) % 1000) % 100) / 10; // 5
		int n5 = (((((numero% 10000) % 100) % 100)) % 10) /1;

		

		

		System.out.printf("O número digitado foi %d %d %d %d %d  ", n1 , n2, n3, n4,n5);

		
		

		
		
			

		
		 
	

		
	}
}
