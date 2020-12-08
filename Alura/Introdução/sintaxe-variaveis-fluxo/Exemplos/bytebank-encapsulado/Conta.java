public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
