// Figura 5.12: AutoPolicyTest.java
// Demonstrando Strings em um switch.

public class AutoPolicyTest 
{
    public static void main(String[] args)
    {
        // cria dois objetos AutoPolicy
        AutoPolicy policy1 = new  AutoPolicy(11111111, "Toyota Camry", "CE");
        AutoPolicy policy2 = new  AutoPolicy(22222222, "Ford Fusion", "SP");

        // exibe se cada apólice está em um estado sem culpa
        policyEmEstadoSemCulpa(policy1);
        policyEmEstadoSemCulpa(policy2);
    }

    // método que motra se um AutoPolicy está em um estado com seguro de automóvel "sem culpa"
    public static void policyEmEstadoSemCulpa(AutoPolicy policy)
    {
        System.out.println("The auto policy");
        System.out.printf("Conta #: %d; Carro: %s; Estado %s %s um estado sem culpa%n%n",
                            policy.getNumeroConta(), policy.getMarcaEModelo(), policy.getEstado(),
                            (policy.eEstadoSemCulpa()? "é ": "não é"));
    }


    
}// fim da classe AutoplicyTest}
