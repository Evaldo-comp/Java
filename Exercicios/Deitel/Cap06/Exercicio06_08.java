
/*
6.8

(Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar 
por até três horas. Um adicional de R$ 0,50 por hora não necessariamente inteira é cobrado após
 as três primeiras horas. A tarifa máxima para qualquer dado período de 24 horas é R$ 10,00. 
 Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo 
 que calcule e exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem 
 m. Você deve inserir as horas de estacionamento para cada cliente. O programa deve exibir a 
 cobrança para o cliente atual e calcular e exibir o total dos recibos de ontem. Ele deve 
 utilizar o método calculateCharges para determinar a tarifa para cada cliente.
*/
import java.util.Scanner;
public class Exercicio06_08{

    Scanner input = new Scanner(System.in);
    
    

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite a quantidade de horas");
        int minutos = input.nextInt();

        System.out.printf("Valor é %f", calculateCharges(minutos));

    }

    static double calculateCharges(int minutos){
        if (minutos <= 60){
            double valor =  2.00;
            return valor;}
       /* }else if (minutos > 60){
            double excesso = minutos / 60;
            double valor = (excesso - 1)* 0.50;
            return valor;
        }*/
    }

   
    
}

     
    


