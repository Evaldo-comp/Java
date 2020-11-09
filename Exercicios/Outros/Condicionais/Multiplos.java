
/******************************************************************************

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

@evaldo2020

*******************************************************************************/
import java.util.Scanner;

public class Multiplos {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num1, num2, mult;
    System.out.println("Digite o primeiro número");
    num1 = input.nextInt();

    System.out.println("Digite o segundo  número");
    num2 = input.nextInt();

    if (num1 >= num2) {
      mult = num1 % num2;
      if (mult == 0) {
        System.out.println("Os números inseridos são múltiplos entre si");
      } else {
        System.out.println("O números inseridos não são múltiplos entre si");
      }
    } else {
      mult = num2 % num1;
      if (mult == 0) {
        System.out.println("Os números inseridos são múltiplos entre si");
      } else {
        System.out.println("Os números inseridos não são múltiplos entre si");
      }
    }

  }
}
