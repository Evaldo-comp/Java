/* Exercicio 10:
*    Adapte o código da seção Tente iso 1-2 para que ele exiba uma tabela de conversões de
*    polegadas para metros. Exiba 12 pés de conversões, polegada a polegada.class
*    Gere uma linha em branco a cada 12 polegadas. (Um metro é igual a aproximadamente 
*    39.37 polegadas)
*/

public class PolToMetTable {
    public static void main (String [] args){
        int pol;
      
        int linhas =1;

        

        for (pol = 0; pol<=100; pol++){
            double metro  = pol ;
            linhas = pol;
            double polToMet = metro / 39.37;
            
            System.out.printf(" %d Polegada(s) é igual a %.2f Metros\n", pol, polToMet);
            if (linhas == 10){
                System.out.println("*********************************");
                linhas = 0;
            }
            
            linhas++;
            
        }
        

       

       
    }
}
