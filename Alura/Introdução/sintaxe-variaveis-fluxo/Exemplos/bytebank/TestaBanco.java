public class TestaBanco {
    public static void main(String[] args) {
       Cliente paulo = new Cliente();
       paulo.nome = "Paulo";
       paulo.cpf = "222.222.222-22";
       paulo.profissao = "programador";

       Conta contaDoPaulo = new Conta();
       contaDoPaulo.deposito(100);
       contaDoPaulo.titular = paulo;
       System.out.println(contaDoPaulo.titular.nome);

       Conta contaDaAna = new Conta();
       contaDaAna.titular = new Cliente();
       contaDaAna.titular.nome = "Ana Beatriz";
       System.out.println(contaDaAna.titular.nome);
    }
    
}
