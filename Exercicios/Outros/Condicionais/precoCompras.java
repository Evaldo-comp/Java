
/******************************************************************************

Com base nos dados abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

ÍTEM: Cachoro-Quente    CÓDIGO: 1       PREÇO: R$ 4,00
ÍTEM: X - Salada        CÓDIGO: 2       PREÇO: R$ 4,50
ÍTEM: X -Bacon          CÓDIGO: 3       PREÇO: R$ 5,00
ÍTEM: Torrada Simples   CÓDIGO: 4       PREÇO: R$ 2,00
ÍTEM: Refrigerante      CÓDIGO: 5       PREÇO: R$ 1,50

@ealdo2020


*******************************************************************************/
import java.util.Scanner;

public class precoCompras 
{
  public static void main(String[] args) 
  {

    Scanner input = new Scanner(System.in);

    int cod, qtd;
    double valor, preco;

    System.out.println("Digite o códio do Produto");
    cod = input.nextInt();

    System.out.println("Digite a quantidade que deseja comprar");
    qtd = input.nextInt();

    if (cod == 1)
    {
        valor = qtd * 4.00;
        System.out.printf("Total: R$ %.2f Reais%n",valor);
    }    
    else if (cod == 2)
    {
        valor = qtd * 4.50;
        System.out.printf("Total: R$ %.2f Reais%n",valor);
    } 
    else if (cod == 3)
    {
        valor = qtd * 5.00;
        System.out.printf("Total: R$ %.2f Reais%n",valor);
    }
    else if (cod == 4)
    {
        valor = qtd * 2.00;
        System.out.printf("Total: R$ %.2f Reais%n",valor);
    }
    else
    {
        valor = qtd * 1.50;
        System.out.printf("Total: R$ %.2f Reais%n",valor);
    }
    
  }
}

