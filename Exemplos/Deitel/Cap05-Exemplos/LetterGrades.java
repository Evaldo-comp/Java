// Figura 5.9: LetterGrades.java
// A classe LetterGrades utiliza a instrução switch para contar as letras das notas escolares.


import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {

        int total = 0; // soma das notas
        int gradeCounter = 0; // número de notas inseridas
        int aCount = 0; // contagem de notas A
        int bCount = 0; // contagem de notas B
        int cCount = 0; // contagem de notas C
        int dCount = 0; // contagem de notas D
        int eCount = 0; // contagem de notas E
        int fCount = 0; // contagem de notas F

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n  %s%n  %s%n",
                          "Entre com uma nota inteira entre 0 e 100",
                          "Quando terminar a inseerção das notas aperte:", 
                          "No UNIX/Linux/Mac ---<CTRL> d e pressione ENTER", 
                          "No Windows ---<CTRL> z e pressione ENTER");   

     // faz loop até o usuário inserir o indicdor de fim do arquivo
       while(input.hasNext())
       {
           int grade = input.nextInt(); // lê a nota
           total += grade; // adicional nota a total
           ++gradeCounter; //Incrementa o número de notas

           //Incrementa o contador de letras de nota adequado
           switch (grade / 10) {
               case 9:  // a nota estava entre 90
               case 10: // e 100, incluso
                    ++aCount;
                   break; // sai do switch
                case 8: // nota estava entre 0 e 89
                    ++bCount;
                    break; 
                case 7: // nota estava entre 70 e 79
                    ++cCount;
                    break;
                case 6: // nota estava entre 60 e 69
                    ++dCount;
                    break;
               default: // a nota era menor que 60
                    ++fCount;
                   break; // opcional; fecha switch de qualquer maneira
           } // fim do switch
       } // fim do while  

       // exibe o relatório da nota
       System.out.printf("%nGrade Report:%n");

       // se o usuário inseriu pelo menos uma nota
       if (gradeCounter != 0)
       {
           // calcula a média de todas as notas inseridas
           double average = (double) total / gradeCounter;

           // gera a saída de resumo de resultado
           System.out.printf("Total de  %d notas inseridas e de %d%n",
                            gradeCounter, total);

            System.out.printf("A média da classe é %.2f%n", average);

            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                               "Número de estudantes que receberam cada nota",
                               "A: ", aCount, // exibe o número de notas A 
                               "B: ", bCount, // exibe o número de notas B 
                               "C: ", cCount, // exibe o número de notas C 
                               "D: ", dCount, // exibe o número de notas D 
                               "F: ", fCount); // exibe o número de notas F 

       } // fim do if
       else // quando nenhuma nota é inserida
            System.out.println("Não foram inseridas nenhuma nota");

        
    } //  fim main
    
} //  fim da classe letterGrades
