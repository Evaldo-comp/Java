public class TesteFuncionario {
    public static void main(String [] args) {
        Funcionario evaldo = new Funcionario();
        evaldo.setNome("Francisco Evaldo");
        evaldo.setCpf("123.456.789-10");
        evaldo.setSalario(2600.00);

        System.out.println(evaldo.getNome());
        System.out.println(evaldo.getBonificacao());
        
    }
}
