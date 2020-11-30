public class TesteReferencias{

    public static void main(String[] args){
        Conta primeirConta = new Conta();
        primeirConta.saldo = 300;

        System.out.println("Saldo da primeira conta: "+ primeirConta.saldo);

        Conta segundaConta = primeirConta; //referenciação
        System.out.println("saldo da segunda conta: "+ segundaConta.saldo);

    }


}