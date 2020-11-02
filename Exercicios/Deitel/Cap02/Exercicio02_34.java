/***********************************************************************************************************
*                                                                                                          *     
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel                                                    *
*                                                                                                          *
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores                               *
*                                                                                                          *
*       (Calculadora de crescimento demográfico mundial) Utilize a internet para descobrir a população     * 
*         mundial atual e a taxa de crescimento demográfico mundial anual. Escreva um aplicativo que       *
*         introduza esses valores e, então, que exiba a população mundial estimada depois de um, dois,     *
*         três, quatro e cinco anos.                                                                       *
*                                                                                                          *
* Solução by @evaldo                                                                                       *
*                                                                                                          *
************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_34{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		double popMundial = 6.900000000, taxa= 2.2;

		double novapopano1 = popMundial + (popMundial*(taxa/100));
		double novapopano2 = novapopano1 + (novapopano1*(taxa/100));
		double novapopano3 = novapopano2 + (novapopano2*(taxa/100));
		double novapopano4 = novapopano3 + (novapopano3*(taxa/100));
		double novapopano5 = novapopano4 + (novapopano4*(taxa/100));

		System.out.printf("A população mundial para depois de 1 ano é %f%n", novapopano1);
		System.out.printf("A população mundial para depois de 2 anos é %f%n", novapopano2);
		System.out.printf("A população mundial para depois de 3 anos é %f%n", novapopano3);
		System.out.printf("A população mundial para depois de 4 anos é %f%n", novapopano4);
		System.out.printf("A população mundial para depois de 5 anos é %f%n", novapopano5);

		
		

		}


	}	


		
		

		
		
			

		
		 
	

		
