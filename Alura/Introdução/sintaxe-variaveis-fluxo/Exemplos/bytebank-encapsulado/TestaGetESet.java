public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(12231);
        System.out.println(conta.getNumero());

        conta.setAgencia(123);
        System.out.println(conta.getAgencia());

        Cliente evaldo = new Cliente();
        //conta.setTitular(evaldo);
        evaldo.setNome("evaldo");
        conta.setTitular(evaldo);
        System.out.println(conta.getTitular().getNome());

        

    }
    
}
