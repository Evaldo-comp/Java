import sun.tools.jstat.SymbolResolutionClosure;

public  class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(12233, 4055);

       System.out.println(conta.getAgencia());

       Conta conta2 = new Conta(12233, 40444);

     System.out.println(Conta.getTotal());
    }
}