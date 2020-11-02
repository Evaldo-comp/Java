/***********************************************************************************************************
*                                                                                                          *     
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel                                                    *
*                                                                                                          *
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores                               *
*                                                                                                          *
*	(Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de            *
*     determinar e imprimir quantos negativos, quantos positivos e quantos zeros foram inseridos.          *
*    os valores resultantes em formato de tabela como a seguir:                                            *                                   * 
*                                                                                                          *
* Solução by @evaldo                                                                                       *
*                                                                                                          *
************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_32{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		int num, neg = 0, pos= 0, zero = 0;
		
		int i = 1;
		
        while (i <=5){
        	System.out.println("Digite um números");
		    num = input.nextInt();	

		    if (num >0){
		    	pos +=1;
		    }else if(num < 0){
		    	neg +=1;
		    }else{
		    	zero+=1;
		    }
		    
		    i+=1;

        }
     

		System.out.printf("Você digitou %d números POSITIVOS, %d números NEGATIVOS e %d ZEROS", pos, neg, zero);
		


		
		

		
		
			

		
		 
	

		
	}
}
