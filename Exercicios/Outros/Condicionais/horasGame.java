
/******************************************************************************

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

@evaldo2020

*******************************************************************************/
import java.util.Scanner;

public class horasGame 
{
  public static void main(String[] args) 
  {

    Scanner input = new Scanner(System.in);
    int horaIni, horaFim, tempo;

    System.out.println("Digite a hora inicial do jogo");
    horaIni = input.nextInt();

    System.out.println("Digite a hora final do jogo");
    horaFim = input.nextInt();

    if (horaIni > horaFim)
    {
        tempo = (24 - horaIni) + horaFim;
        System.out.printf("O jogo durou %d horas %n",tempo);
    }    
    else if (horaIni < horaFim)
    {
        tempo = horaFim - horaIni;
        System.out.printf("O jogo durou %d horas %n",tempo);
    } 
    else 
    {
        System.out.println("O jogo durou 24 horas\n ");
    }
    
  }
}

