// Algumas manipulações básicas com booleanos

public class BoolDemo {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b é "+b);
        b = true;
        System.out.println("b é "+b);

        //booleanos são geralmente utilizados para controlar estruturas de decisão
        if(b) System.out.println("Esse trecho será executado");

        b = false;
        if(b) System.out.println("Esse trecho não será executado");

        // o resultado de operações com operadores lógicos resulta em um booleano
        System.out.println("10 > 9 é " + (10 > 9));


    }
}
