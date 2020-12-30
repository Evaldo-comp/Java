// uma variável não funciona fora do escopo onde foi criada

public class ScopeDemo {
    public static void main(String args[]){
        int x;

        x = 10;
        if(x==10){
            int y =20; // essa variável não será reconhecido fora do bloco

            System.out.println("x e y: " + x + " "+ y);
            x++;
            System.out.println("x "+ x);
        }
       // y = 100; // erro posi y está fora de seu escopo
        
        //porém x ainda é reconhecido
        System.out.println("x "+ x);
    }
    
}
