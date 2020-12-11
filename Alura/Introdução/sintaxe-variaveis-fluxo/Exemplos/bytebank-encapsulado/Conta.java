public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    static int total;

    // Contrutor
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de conta é  " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);
    }


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
        if (numero <= 0){
            System.out.println("Não pode número negativo");
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Meu querido, não pode número negativo, sacou?");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
