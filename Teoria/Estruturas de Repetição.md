### ELEMENTOS DE REPETIÇÃO

#### WHILE:<br> 
Essa estrutura realiza um teste condicional e executa a instrução dentro de seu bloco enquanto esse teste retorna verdadeiro. Indicada usar quando o número de repetições é uma incógnita.

***Estrutura***
> While(condição){<br>
>   comando;<br>
> }<br>

Se a condição for verdadeira ela volta e executa, diferentemente do ***if*** que executa apenas uma vez.

Exemplo:
```Java
import java.util.*;
class Main {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      int soma = 0, num=1;  
   
    
    while(num !=0){
      System.out.println("Digite um número");
      num = input.nextInt();   
      soma +=num;  
    }
    System.out.printf("A soma dos números é %d", soma);
  
 }
}
```

______

#### FOR

Essa estrutura realiza uma repetição considerando um certo intervalo. Possui trẽs elememntos não obrigatórios, elemnto que starta o loop, a consição de teste e o incremento ou decremento que realiza o controle  do loop:<br>

Estrutura:<br>
> for(inicio; condicao; incremento){
>    comando;
> }

Exemplo:
```Java
import java.util.*;
class Main {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int soma = 0, num=1;  
    num = input.nextInt();
  
    for(int i =0; i < num; i++){
     int x= input.nextInt();
     soma+=x;
   }
    System.out.printf("%d", soma);
  
 }
}
```

______





