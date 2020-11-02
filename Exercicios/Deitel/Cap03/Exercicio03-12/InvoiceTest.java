import java.util.Scanner;

public class InvoiceTest
{
	public static void main(String[] args)
	{
         Invoice n = new Invoice("00000", "Acessório", 100, 10.0);

         System.out.printf("Numero: %s\nDescrição: %s\nQuantidade: %d\n" +
            "Preço: %.2f\nTotal: %.2f\n", n.getNumero() , n.getDesc() ,
            n.getQuantidade() , n.getPreco(), n.getInvoiceAmount());

         n.setPreco(1.99);
         n.setQuantidade(20);

         System.out.printf("Número: %s\nDescrição: %s\nQuantidade: %d\n" + 
            "Preço: R$%.2f\n Total: R$%.2f\n", n.getNumero(), n.getDesc(), n.getQuantidade(), n.getPreco(), n.getInvoiceAmount());

   }
}
