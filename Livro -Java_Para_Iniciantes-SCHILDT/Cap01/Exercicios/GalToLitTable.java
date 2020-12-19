// converte galões em litros incrementando o número de galões

public class GalToLitTable {
    public static void main (String [] args){
        double galoes = 1;
        double litros;  
        int linhas =1;

        

        for (int count = 0; count<100; count ++){
            litros  = galoes * 3.1854;
            
            System.out.println(galoes + " Galões é " + litros + " litros");
            if (linhas == 10){
                System.out.println("*********************************");
                linhas = 0;
            }
            galoes++;
            linhas++;
            
        }
        

       

       
    }
}
