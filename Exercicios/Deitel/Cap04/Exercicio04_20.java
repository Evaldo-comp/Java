

import java.util.Scanner;

/*
 * (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de 
 * cada um de três empregados. A empresa paga as horas normais pelas primeiras 40 horas 
 * trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
 * horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na 
 * semana passada e o salário-hora de cada um. Seu programa deve aceitar a entrada dessas 
 * informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
 */

public class Exercicio04_20 {
	
	private String nome;
	private double salarioHora, salarioTotal;
	private int qtdHoras;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getNome() {
		return nome;
	}
	
	void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	double getSalarioHora() {
		return salarioHora;
	}
	
	void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	
	int getQtdHoras() {
		return qtdHoras;
	}
	
	double salarioTotal() {
		if (qtdHoras > 40) {
			return (((qtdHoras - 40) * (salarioHora + salarioHora/2)) + 40 * salarioHora);
		}else {
			return 40 * salarioHora;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		Exercicio04_20 calcSalario = new Exercicio04_20();
		int cont = 1, qtdHoras = 0;
		String n;
		double salarioHora;
		
		
		
		while(cont <= 3) {
			System.out.println("Digite o seu nome");
			n = input.nextLine();
			calcSalario.setNome(n);
			
			System.out.println("Digite o valor de seu Salario Hora");
			salarioHora = input.nextDouble();
			calcSalario.setSalarioHora(salarioHora);
			
			System.out.println("Quantas horas você trabalhou essa semana?");
			qtdHoras = input.nextInt();
			calcSalario.setQtdHoras(qtdHoras);
			
			System.out.printf("%s Seu você trabalhou %d, seu salário nesta semana será de R$ %.2f Reais%n", 
					calcSalario.getNome(), calcSalario.getQtdHoras(), calcSalario.salarioTotal());
			input.nextLine();
			cont +=1;
		}
		

	}

}
