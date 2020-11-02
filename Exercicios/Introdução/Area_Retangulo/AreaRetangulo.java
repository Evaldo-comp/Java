/*
*Fazer um programa para ler os valores da largura e altura de um retângulo.
*Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
*/

import java.util.Scanner;

public class AreaRetangulo{

	public double largura;
	public double altura;

	public double Area(){
		return largura * altura;
	}

	public double Perimetro(){
		return largura * 2 + altura * 2;
	}

	public double Diagonal(){
		return largura * largura + altura * altura;
	}


}


