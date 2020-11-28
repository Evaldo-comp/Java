public class TestaCondicional {
    public static void main(String[] args){
      int idade = 20;
      int quantidePessoas = 3;
      if (idade >= 18 ){
          System.out.println("Você tem mais de 18 anos");
          System.out.println("Seja Bem Vindo");
      }else if (quantidePessoas >= 2){
          System.out.println("Pode entrar, por ter acompanahntes maiores");     
      }else{
           System.out.println("Infelizmente você não pode entrar");
      }
    }
}
