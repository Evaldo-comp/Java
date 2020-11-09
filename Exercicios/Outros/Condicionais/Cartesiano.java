
/******************************************************************************

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
                y
                |
                |
            Q2  |  Q1
      __________|__________x
                |
            q3  |  Q4
                |
      __________|

      @evaldo 2020
*******************************************************************************/
import java.util.Scanner;

public class Cartesiano
{
  public static void main(String[] args) 
  {

    Scanner input = new Scanner(System.in);

    double num1, num2;
    

    System.out.println("Digite o primeiro número");
    num1 = input.nextDouble();

    System.out.println("Digite o segundo número");
    num2 = input.nextDouble();

    if (num1 > 0 && num2 > 0)
    {
        System.out.println("Q1");
    }
    else if (num1 < 0  && num2 > 0)
    {
        System.out.println("Q2");
    }
    else if (num1 < 0  && num2 < 0)
    {
        System.out.println("Q3");
    }
    else if (num1 > 0 && num2 < 0)
    {
        System.out.println("Q4");
    }
    else
    {
        System.out.println("ORIGEM");
    }
    
  }
}

