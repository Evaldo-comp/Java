/* uma variável que é incializada dentro de um bloco, sempre recupera 
*  esse valor com o qual foi incializada, toda vez que o bloco for incializado
*/

public class VarInitDemo {
    public static void main(String args[]){
        int x;

        for(x = 0; x < 3; x++){
            int y =-1; // sempre que voltarmos ao bloco, y será incializada
            System.out.println("y é "+ y);
            y = 100;
            System.out.println("y é "+ y);

        }
    }
    
}
