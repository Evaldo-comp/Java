
/******************************************************************************

Fazer um programa para ler um valor inteiro de 1 a 7 represetando um dia da semana
(sendo 1 = domingo, 2 = Segunda, e assim por diante).
Escrever na tela o dia da semana correspondente, conforme exemplos.


@evaldo 2020

*******************************************************************************/
import java.util.Scanner;

public class diasSemana
{
  public static void main(String[] args) 
  {

    Scanner input = new Scanner(System.in);

    int num;
    

    System.out.println("Digite um numero de 1 a 7");
    num = input.nextInt();

    switch(num)
    {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda");
            break;
        case 3:
            System.out.println("Terça");
            break;
        case 4:
            System.out.println("Quarta");
            break;
        case 5:
            System.out.println("Quinta");
            break;
        case 6:
            System.out.println("Sexta");
            break;
        case 7:
            System.out.println("Sabado");
            break;
        case deafult:
            System.out.println("Valor inválido");
            break;





    }
    
  }
}

