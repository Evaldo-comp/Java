import java.util.Scanner;

public class ProdutoTeste
{
	public static void main(String[] args)
	{
         Produto produto1 = new Produto();

	    // exibe saldo incial
        // System.out.printf("%s Saldo: R$%.2f até agora foi debitado R$%.2f%n", account1.getName(), account1.getBalance(), account1.getDebito());

         // Cria um scanner para obeter entrada a a partir da janela d comando
         Scanner input = new Scanner(System.in);

         System.out.print("Digite o nome do Produto\n");
         String  nomeProduto = input.nextLine();
         System.out.printf("Foi adicionado %s ao estoque%n", nomeProduto);
		   //produto1.entrada(nomeProduto);

         System.out.print(" Digite o preço do Produto\n");
         double  precoProduto = input.nextDouble();
         //produto1.entrada(precoProduto);

         System.out.print("Digite a quantidade do Produto\n");
         int  quantidadeProduto = input.nextInt();

         produto1.Entrada(nomeProduto, precoProduto, quantidadeProduto );

         System.out.printf("Valor total no estoque R$%.2f%n", produto1.valorTotal());


         System.out.printf("Você adicionou %d unidade(s) %s%n", produto1.getQuantidade(), produto1.getNome());
        // System.out.printf("%d unidades%n", produto1.getQuantidade());
         System.out.printf("Total de  R$%.2f%n", produto1.getPreco() * quantidadeProduto);

         System.out.print("Digite a quantidade que deseja retirar\n");
         int  retiradaProduto = input.nextInt();
         //produto1.entrada(quantidadeProduto);

         
         produto1.Saida(nomeProduto, precoProduto, retiradaProduto );


         System.out.printf("Você Retirou %d, unidade(s) de %s%n",produto1.getQuantidade(), produto1.getNome());
         System.out.printf("Restaram %d unidades%n", quantidadeProduto - retiradaProduto);

         System.out.printf("Valor total no estoque R$%.2f%n", produto1.valorTotal());
  
		 
	}	 

}