public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    // metodo para depositar
    void deposito(double valor){
        this.saldo += valor;
    }

    // metodo saca
    public boolean saca(double valorSaque){
        if (this.saldo <= 0 || this.saldo < valorSaque){
            System.out.println("Saldo insuficiente");
            return false;
        }else{
            this.saldo -= valorSaque;
            return true;
        }
        
    }

     // metodo transfere
    public boolean transfere(double valorTransf, Conta origem, Conta destino ){
        if (this.saldo >= valorTransf){
            //this.saldo -= valorTransf;  utilizado sem terceiro paramentro e sem métod saca()
            origem.saca(valorTransf);
            //destino.saldo += valorTransf;
            destino.deposito(valorTransf);
            return true;
        }else{
            return false;

        }
    }
}
