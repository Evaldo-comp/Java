/**
 * Adaptado do livro - Java, como Programar 10 ed (Paul Deitel e Harvey Deitel)
 * @evaldo 24/06/2020 
 *
 *Entrada de Dados
 *
 */


import java.util.Scanner; //importa a classe Scanner para a captura de dados do usuário


public class EntradaDeDados
{
// método main inicia a execução do aplicativo Java
	public static void main(String[] args)
	{
		//cria um scanner para receber dados a partir do terminal
		Scanner input = new Scanner(System.in);
		//Locale.setDefault(Localer.US); Deve ser adicionado caso queira utilizar (.) nos 
		//números de ponto flutuante caso não seja utilizado, os números de ponto flutuante serão escritos com vírgula

		int idade;
		double altura; 
		String nome;
		char genero;
		String nomeCompleto; 


		System.out.print("Digite o seu primeiro nome: ");//Mensagem no terminal
		nome = input.next(); //Como é um nome sem espaços, usa-se apenas o next()

		/*OBS: Se algum dado for digitado antes do nextline() e for pressionado ENTER
		isso irá gerar uma linha vazia que será consumida pelo próximo nextLine
		consequentemente irá gerar um erro pois a variável irá consumir uma string vazia.
		Como solução para esse problema é aconcelhável digitar um nextLine extra
		para consumir a linha pendente
		*/

		input.nextLine(); // nextLine extra para consumir a linha pendende gerada pela entrada acima

		System.out.print("Digite o seu nome completo: ");//Mensagem no terminal
		nomeCompleto = input.nextLine(); //Neste caso será utilizado espaços entre as letras então o método a ser utilizado deve ser o nextLine();


		
		System.out.print("Qual o seu gênero? Digite M masculino, F para feminino ou O para outros ");//Mensagem no terminal
		genero = input.next().charAt(0); //o charAT(0)pega o primeiro caractere da string

		System.out.print("Digite a sua idade: ");//Mensagem no terminal
		idade = input.nextInt(); //Lê a idade

		System.out.print("Entre com a sua altura: ");//Mensagem no terminal
		altura = input.nextDouble(); //Lê a altura

		
		System.out.printf("Olá %s, você tem %d anos e %.2f de altura e seu gênero é %c%n", nome, idade, altura, genero);
		System.out.println(nomeCompleto);



	} // fim do método main
} // fim da classe EntradaDeDados