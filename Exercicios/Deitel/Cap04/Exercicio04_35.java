

import java.util.Scanner;
import java.math.*;

/*
 * (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de 
 * zero inseridos pelo usuário, determina e imprime se eles poderiam representar 
 * os lados de um triângulo.
 */

public class Exercicio04_35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l1, l2, l3;
		
		System.out.println("Insira os valores dos 3  lados");
		l1 = input.nextInt();
		l2 = input.nextInt();
		l3 = input.nextInt();
		
		if ((l1 < (l2 + l3)) && (l1 > Math.abs(l2 -l3))){
			if ((l2 < (l1 + l3)) && (l2 > Math.abs(l1 -l3))) {
				if	((l3 < (l2 + l1)) && (l3 > Math.abs(l2 -l1))){
					System.out.println("O valores inseridos podem formar uma Triângulo");
				}
				else {System.out.println("Os valores inseridos não podem formar um Triângulo");}
			}else {System.out.println("Os valores inseridos não podem formar um Triângulo");}
		}else {System.out.println("Os valores inseridos não podem formar um Triângulo");}		
			   
	}
}		
		

	


