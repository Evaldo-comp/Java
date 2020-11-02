import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String[] args)
	{
         Employee n1 = new Employee("José", "Alves", 1.200);
         Employee n2 = new Employee("Ana", "Ribeiro", 2.200);
         Scanner input = new Scanner(System.in);

         System.out.printf("Nome: %s   Salário Anual: R$%.2f\n", n1.getNome(), n1.getSalario()*12 );
         System.out.printf("Nome: %s   Salário Anual: R$%.2f\n", n2.getNome(), n2.getSalario()*12 );

         n1.setSalario(n1.getSalario()*1.1);
         n2.setSalario(n2.getSalario()*1.1);

         System.out.printf("Nome: %s   Salário Anual: R$%.2f\n", n1.getNome(), n1.getSalario()*12 );
         System.out.printf("Nome: %s   Salário Anual: R$%.2f\n", n2.getNome(), n2.getSalario()*12 );


   
   }
}
