// Figura 5.13: BreakTest.java
// a instrução break sai de uma instrução for.

public class BreakTest 
{
    public static void main(String[] args)
    {
        int count ; // variável de controle

        for (count = 1; count <= 10; count++) // faz o loop 10 vezes
        {
            if (count == 5)
                break; // termina o loop se a contagem for 5
            System.out.printf("%d ", count);
        }
        
        System.out.printf("%nLoop interrompido na contagem = %d%n", count);
    }
} // fim da clase BrealTests