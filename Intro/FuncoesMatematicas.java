/**
 * 
 * @evaldo 21/07/2020 
 *
 *algumas das principais funções matemáticas em Java
 *Math.sqrt(x)  - retorna a raiz quadrada
 *Math.pow(x, y)  - retorna x elevado a y
 *Math.abs(x)  - retorna o valor absoluto de x
 */

public class FuncoesMatematicas
{
// método main inicia a execução do aplicativo Java
	public static void main(String[] args)
	{
		
		double x = 1.0;
		double y = 3.9;
		double z = -4.2;
		double rqx, rqy, rqz;
		double qx, qy, qz;
		double absx, absy, absz;

		rqx = Math.sqrt(x);
		rqy = Math.sqrt(y);
		rqz = Math.sqrt(z);
		System.out.println("\n\n");
		System.out.println("########## RAIZ QUADRADA ##########\n");


		System.out.println("A Raiz quadrada de " + x + " = " + rqx);
		System.out.println("A Raiz quadrada de " + y + " = " + rqy);
		System.out.println("A Raiz quadrada de " + z + " = " + rqz);

		System.out.println("\n\n");
		System.out.println("########## POTENCIAÇÃO ##########\n");

		qx = Math.pow(x, 2.0);
		qy = Math.pow(y, 2.0);
		qz = Math.pow(z, 2.0);


		System.out.println( x + " Elevado ao quadrado é " + qx);
		System.out.println( y + " Elevado ao quadrado é " + qy);
		System.out.println( z + " Elevado ao quadrado é " + qz);

		System.out.println("\n\n");
		System.out.println("########## VALOR ABSOLUTO ##########\n");

		absx = Math.abs(x);
		absy = Math.abs(y);
		absz = Math.abs(z);

		System.out.println("O valor absoluto de  " + x + " = " + absx);
		System.out.println("O valor absoluto de  " + y + " = " + absy);
		System.out.println("O valor absoluto de  " + z + " = " + absz);

	} // fim do método main
} // fim da classe FuncoesMatematicas