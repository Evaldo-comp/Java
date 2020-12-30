public class castDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // occore a perda de informação por doub > int
        System.out.println("O inteiro resultante da divisão de x por y é : " + i);

        i = 100;
        b = (byte) i; // sem perda de informação
        System.out.println("Valor de b: "+ b);

        i = 257;
        b = (byte) i ; // perda de informação pois 1 byte < 257
        System.out.println("Valor de b: "+ b);

        b = 88;
        ch = (char) b;  // coerção entre incompatíveis
        System.out.println("ch é: "+ch);
    }
    
}
