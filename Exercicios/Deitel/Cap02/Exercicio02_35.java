/***********************************************************************************************************
*                                                                                                          *     
*	JAVA - Como Programar by Paul Deitel, Harvey Deitel                                                    *
*                                                                                                          *
*	Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores                               *
*                                                                                                          *
*       (Calculadora de economia da faixa solidária) Pesquise vários sites sobre faixa solidária. Crie     *
*         um aplicativo que calcule o custo diário de dirigir, para estimar quanto dinheiro pode ser       *
*         economizado com o uso da faixa solidária, que também tem outras vantagens, como reduzir emissões * 
*         de carbono e congestionamento de tráfego. O aplicativo deve introduzir as seguintes informações e*
*         exibir o custo por dia de dirigir para o trabalho do usuário:                                    *
*                                                                                                          *
*         a) Quilômetros totais dirigidos por dia.                                                         *
*         b) Preço por litro de gasolina.                                                                  *
*         c) Quilômetros médios por litro.                                                                 *
*         d) Taxas de estacionamento por dia.                                                              *
*         e) Pedágio por dia                                                                               *
*                                                                                                          *
* Solução by @evaldo                                                                                       *
*                                                                                                          *
************************************************************************************************************/
import java.util.Scanner;

public class Exercicio02_35{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		int km_dia;
		double preco_gasolina, quil_med_por_litro, estacionamento, pedagio, custo_dia, custo_mes, custo_ano;


		System.out.println("Quantos quilômetros você percorre por dia de casa ao trabalho:");
		km_dia = input.nextInt();

		System.out.println("Insira o valor do litro de gasolina");
		preco_gasolina = input.nextDouble();

		System.out.println("Quantos quilômetros em média você percorre com um litro de gazolina?");
		quil_med_por_litro = input.nextDouble();

		System.out.println("Digite quanto você paga de estacionamento por dia");
		estacionamento = input.nextDouble();

		System.out.println("Digite quanto você paga de Pedágio por dia");
		pedagio = input.nextDouble();

		custo_dia = ((km_dia/quil_med_por_litro) * preco_gasolina) + estacionamento + pedagio;
		custo_mes = custo_dia * 25;
		custo_ano = custo_mes * 12;

		System.out.printf("Total de gastos por dia R$ %.2f Reais%n", custo_dia);
		System.out.printf("Total de gastos por mês R$ %.2f Reais%n", custo_mes);
		System.out.printf("Total de gastos por ano R$ %.2f Reais%n", custo_ano);
		
		

		}


	}	


		
		

		
		
			

		
		 
	

		
