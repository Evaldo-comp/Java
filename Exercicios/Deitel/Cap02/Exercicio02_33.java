/***********************************************************************************************************
*                                                                                                          *     
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel                                                    *
*                                                                                                          *
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores                               *
*                                                                                                          *
*       (Calculadora de índice de massa corporal) Escreva um programa que calcule o IMC do usuário e       *
*		retorne uma mensagem classificando-o de acorod com os dados                                        *
*		Fórmula - IMC = peso/altura * altura                                                               *
*		Menos do que 18,5 	Abaixo do peso                                                                 *
*		Entre 18,5 e 24,9 	Peso normal                                                                    *
*		Entre 25 e 29,9 	Sobrepeso                                                                      *
*		Entre 30 e 34,9 	Obesidade grau 1                                                               * 
*		Entre 35 e 39,9 	Obesidade grau 2                                                               *
*		Mais do que 40 	Obesidade grau 3                                                                   * 
*                                                                                                          *
* Solução by @evaldo                                                                                       *
*                                                                                                          *
************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_33{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		double peso, altura, imc;
		
		

		System.out.printf("Digite o seu Peso");
		peso = input.nextDouble();

		System.out.printf("Digite sua Altura");
		altura = input.nextDouble();

		imc = peso / (altura * altura);

		if (imc < 18){
			System.out.printf("Seu IMC é %.2f. Você está abaixo do peso", imc);
		}else if (imc >= 18 && imc < 25){
			System.out.printf("Seu IMC é %.2f. Você está com o peso normal", imc);
		}else if (imc >= 24 && imc < 30){
			System.out.printf("Seu IMC é %.2f. Você está está com sobrepeso", imc);
		}else if (imc >= 30 && imc < 34){
			System.out.printf("Seu IMC é %.2f. Você está com obesidade GRAU 1", imc);
		}else if(imc >= 34 && imc < 40){
			System.out.printf("Seu IMC é %.2f. Você está com obesidade GRAU 2", imc);
		}else{
			System.out.printf("Seu IMC é %.2f. Você está com obesidade GRAU 3", imc);
		}


		


		
		

		
		
			

		
		 
	

		
	}
}
