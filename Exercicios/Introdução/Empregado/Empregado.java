/*
*  Fazer um programa para ler os dados de um funcionário(nome, salário bruto e imposto).
*  em seguida, mostrar oso dados do funcionário(nome e salário líquido). em seguida, aumentar o
*  salário do funcionário com base em uma porcentagem dada(Somente o salário bruto é afetado
*  pela porcentagem) e mostrar novamente os dados do funcionário.
*/

import java.util.Scanner;

public class Empregado{

	public String nome;
	public double salarioBruto;
	public double taxa;
	

	public void AumentaSalario(double porcentagem){
		salarioBruto += salarioBruto * (porcentagem/100.0);
	}

	public double salarioLiquido(){
		return salarioBruto - taxa;
	}

	public String toString(){
		return nome + ", R$ "+ String.format("%.2f", salarioLiquido());
	}

	
	}





