import java.util.Locale;
import java.util.Scanner;

public class EstudanteApp{
	public static void  main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);


		Estudante estu = new Estudante();

			System.out.println("Digite o nome do Estudante: ");
			estu.nome = input.nextLine();

		System.out.println("Digite as três notas: ");
		estu.nota1 = input.nextDouble();
		estu.nota2 = input.nextDouble();
		estu.nota3 = input.nextDouble();

		System.out.printf("Nota Final: %.2f", estu.notafinal());

		if (estu.notafinal()<60.0){
			System.out.println("REPROVADO%n");
			System.out.printf("MISSING %.2f POINTS%n", estu.pontosFaltantes());
		}
		else{
			System.out.println("APROVADO%n");
		}
	//	System.out.printf("Salário Líquido: %.2f%n", empregado.salarioLiquido());
	
		input.close();
	} 


}