import java.util.Locale;
import java.util.Scanner;

public class AreaRetanguloApp{
	public static void  main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);


		AreaRetangulo retangulo = new AreaRetangulo();

		System.out.println("Entre com a medida da largura e altura do Retângulo: ");
		retangulo.largura = input.nextDouble();
		retangulo.altura = input.nextDouble();

		System.out.printf("Área: %.2f%n", retangulo.Area());
		System.out.printf("Perímetro: %.2f%n", retangulo.Perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.Diagonal());

		input.close();
	} 


}