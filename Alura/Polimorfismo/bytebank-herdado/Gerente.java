public class Gerente extends Funcionario {
    
    private int senha  = 0;


    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }else{
            return false;
        } 
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    //public double Bonificacao(){
      //  return this.salario;
    //}
}
