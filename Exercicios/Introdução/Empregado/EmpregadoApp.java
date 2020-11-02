import java.util.Locale;
import java.util.Scanner;

public class EmpregadoApp{
	public static void  main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);


		Empregado empregado = new Empregado();

		System.out.println("Qual o nome do funcionário?: ");
		empregado.nome = input.nextLine();

		System.out.println("Insira o valor do Salário Bruto: ");
		empregado.salarioBruto = input.nextDouble();

		System.out.println("Qual a taxa de desconto?: ");
		empregado.taxa = input.nextDouble();

		System.out.println();
		System.out.println("Empregado: " + empregado);

		System.out.println("Quantos porcento deve ser o aumento?: ");
		double porcentagem = input.nextDouble();
		empregado.AumentaSalario(porcentagem);


		System.out.println();

		System.out.println("Update" + empregado);
	//	System.out.printf("Salário Líquido: %.2f%n", empregado.salarioLiquido());
	
		input.close();
	} 


}