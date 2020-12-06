public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta =  new Conta();
        conta.saldo = 100;
        conta.deposito(50);
        //conta.saca();
        


        Conta conta2 = new Conta();
        conta2.saldo = 150;
       
        
        conta2.transfere(40, conta2, conta); 

        System.out.println(conta.saldo);
        System.out.println(conta2.saldo);


    }

        
}
    

