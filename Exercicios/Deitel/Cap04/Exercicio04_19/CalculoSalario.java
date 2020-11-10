

import java.util.Scanner;

public class CalculoSalario {
	private String nome;
	private int horasTrabalhadas;
	private float valorHora;
	private float salarioSemana;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getNome() {
		return nome;
	}
	
	void setHorasTrabalhadas(int horas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	void setSalarioHora(float salarioHora) {
		this.valorHora = valorHora;
	}
	
	float getSalarioHora() {
		return valorHora;
	}
	
	float calculoSalarioSemana(int horasTrabalhadas, float valorHora) {
		if (horasTrabalhadas > 40) {
			salarioSemana = ((horasTrabalhadas - 40) * (valorHora + (valorHora/2)) + (valorHora * 40));
		}else {
			salarioSemana = horasTrabalhadas * valorHora;
		}
		
		return salarioSemana;
	}
}
