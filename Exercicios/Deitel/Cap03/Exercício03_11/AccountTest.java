import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
         Account account1 = new Account("Evaldo", 100.00, 0.0);

	    // exibe saldo incial
         System.out.printf("%s Saldo: R$%.2f até agora foi debitado R$%.2f%n", account1.getName(), account1.getBalance(), account1.getDebito());

         // Cria um scanner para obeter entrada a a partir da janela d comando
         Scanner input = new Scanner(System.in);

         System.out.print(" Entre com um depósito na sua conta\n");
         double depositAmount = input.nextDouble();
         System.out.printf("Foi adicionado R$%.2f a sua conta%n", depositAmount);
		   account1.deposito(depositAmount);// Adiciona saldo a Account
		   System.out.printf("Seu saldo atual é: R$%.2f", account1.getBalance());


         System.out.print(" quanto você deseja debitar da sua conta?\n");
         double debito = input.nextDouble();
         System.out.printf("Foi debitado R$%.2f da sua conta%n", debito);
		 account1.debito(debito); //
		 //double saldo = account1.getBalance() - debito;
		 System.out.printf("Seu saldo atual é: R$%.2f %n", account1.getBalance());
	}	 

}