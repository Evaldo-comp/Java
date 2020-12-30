// Variáveis do tipo char poder tratadas como inteiros

public class CharAriDemo {
    public static void main(String args[]) {
        char ch;
        
        ch = 'X';
        System.out.println("ch contém "+ch);

        ch++; //um char pode ser incrementado
        System.out.println("ch agora contém "+ ch);

        ch = 90; // Um tipo char pode receber um inteiro
        System.out.println("ch agora contém "+ ch);
    }
}
