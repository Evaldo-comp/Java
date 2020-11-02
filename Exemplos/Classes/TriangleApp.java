import java.util.Locale;
import java.util.Scanner;

public class TriangleApp{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Triangle	x, y;
		
		x = new Triangle();
		y = new Triangle();	

		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();

		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();


		double areaX = x.area();
		double areaY = y.area();

		
		System.out.printf("Triangulo X área: %.4f%n", areaX);
		System.out.printf("Triangulo Y área: %.4f%n", areaY);

		if (areaX > areaY){
			System.out.println("Maior Área: X");			
		}
		else{
			System.out.println("Maior Área: Y");
		}
		input.close();

	}


}