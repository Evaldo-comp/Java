/*
* Fazer um programa para ler o nome de uma aluno e as três notas que ele obteve nos três trimestres do 
* no(Primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota  
*final do aluno no ano. Dizer também se o aluno está aprovado(APROVADO) ou não (REPROVADO) e em caso 
*negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
*/
import java.util.Scanner;

public class Estudante{

	public double nota1, nota2, nota3;
	public String nome;

	public double notafinal(){
		return nota1 + nota2 + nota3;
	}

	public double pontosFaltantes(){
		if (notafinal()< 60.0){
			return 60.0 - notafinal();
		}
		else{
			return 0.0;
		}
	}


}