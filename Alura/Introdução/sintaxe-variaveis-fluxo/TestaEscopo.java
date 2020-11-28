public class TestaEscopo {
    public static void main(String[] args){
      int idade = 20;
      int quantidePessoas = 3;

      boolean acompanhado;
     
      if(quantidePessoas >= 2){
          acompanhado = true;
      }else{
          acompanhado = false;
      }



      if (idade >= 18 || quantidePessoas >= 2){
          System.out.println("Você tem mais de 18 anos");
          System.out.println("Seja Bem Vindo");     
      }else{
           System.out.println("Infelizmente você não pode entrar");
      }
    }
}
