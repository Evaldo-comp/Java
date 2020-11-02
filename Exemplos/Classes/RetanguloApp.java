import java.util.Locale;
import java.util.Scanner;

public class RetanguloApp{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Retangulo	x, y;
		
		x = new Retangulo();
		y = new Retangulo();	

		x.a = input.nextDouble();
		x.b = input.nextDouble();
		

		y.a = input.nextDouble();
		y.b = input.nextDouble();
		


		double areaX = x.area();
		double areaY = y.area();

		
		System.out.printf("Retangulo X área: %.4f%n", areaX);
		System.out.printf("Retangulo Y área: %.4f%n", areaY);

		if (areaX > areaY){
			System.out.println("Maior Área: X");			
		}
		else{
			System.out.println("Maior Área: Y");
		}
		input.close();

	}


}