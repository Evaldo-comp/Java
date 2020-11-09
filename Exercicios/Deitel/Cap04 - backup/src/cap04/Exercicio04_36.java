package cap04;

import java.util.Scanner;

/*
 * (Lados de um triângulo retângulo) Escreva um aplicativo que lê três inteiros diferentes de zero, 
 * determina e imprime se eles poderiam representar os lados de um triângulo retângulo.
 */
public class Exercicio04_36 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cat1, cat2, h;
		
		System.out.println("Insira o valor do cateto 01");
		cat1 = input.nextInt();
		System.out.println("Insira o valor do cateto 02");
		cat2 = input.nextInt();
		System.out.println("Insira o valor da Hipotenusa");
		h = input.nextInt();
		
		if ((h*h) == ((cat1 * cat1) + (cat2 * cat2)))
		{
			System.out.println("Os dados inseridos podem configurar um Trângulo Retângulo");
		}else {
			System.out.println("Valores incoerentes");
		}
		
			   
	}
	}


