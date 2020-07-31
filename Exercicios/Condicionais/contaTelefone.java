
/******************************************************************************

Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a
100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
custa R$ 2.00. Fazer um programa para ler a quantidade de minutos consumidos 
e retornar o valor a ser pago


@evaldo 2020

*******************************************************************************/
import java.util.Scanner;

public class contaTelefone
{
  public static void main(String[] args) 
  {

    Scanner input = new Scanner(System.in);

    int minutos;
    double valordaConta = 50.0;

    System.out.println("entre com a quantidade de minutos consumidos");
    minutos = input.nextInt();

    if (minutos > 100)
    {
    valordaConta +=  (minutos - 100 ) * 2.0;
        System.out.printf("Total da conta: R$ %.2f%n", valordaConta);
    }
    else 
    {
        System.out.println("Total da conta: R$ 50.00 Reais");
    }
    
    
  }
}

