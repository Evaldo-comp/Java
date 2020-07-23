/**
 * A
 * @evaldo 21/07/2020 
 *
 *Processamento de dados e Casting
 *O casting é basicamente uma conversão explícita de tipo de dado
 */


import java.util.Scanner; //importa a classe Scanner para a captura de dados do usuário

public class Casting
{
// método main inicia a execução do aplicativo Java
	public static void main(String[] args)
	{
		//cria um scanner para receber dados a partir do terminal
		Scanner input = new Scanner(System.in);

		int numero1 = 5;
		double numero2 = 6.2;
		int soma; 

		soma = numero1+ (int) numero2; //Aqui ocorre o casting para converter um double para int


		System.out.println(soma);//Mensagem no terminal
		



	} // fim do método main
} // fim da classe Casting