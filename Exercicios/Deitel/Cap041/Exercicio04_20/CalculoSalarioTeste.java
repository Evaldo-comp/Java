package Exercicio04_20;
import java.util.Scanner;

public class CalculoSalarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		CalculoSalario salario = new CalculoSalario();
		
		String nome = "";
		int qtdeHoras;
		float horasTrabalhadas;
		float salarioHora;
		int controlador = 1;
		
		while(controlador ==1) {
			
			System.out.println("Digite seu nome, ou 'exit' para sair: ");
			nome = input.nextLine();
			salario.setNome(nome);
			
			/*if (salario.getNome()== "exit") {
				break;
			}*/
	
			System.out.println("Digite a quantidade de horas que você trabalhou nesta semana: ");
			qtdeHoras = input.nextInt();
			salario.setHorasTrabalhadas(qtdeHoras);
			
			System.out.println("Digite o valor da seu salário por hora: ");
			salarioHora = input.nextFloat();
			salario.setSalarioHora(salarioHora);
			
			System.out.printf("Olá %s você reberá o total de RS %.2f Reais%n", salario.getNome(), salario.calculoSalarioSemana(qtdeHoras, salarioHora));
			
			System.out.println("Digite 2 para sair, ou 1 para continuar");
			controlador = input.nextInt();
			
			input.nextLine();
		}
	}

}
