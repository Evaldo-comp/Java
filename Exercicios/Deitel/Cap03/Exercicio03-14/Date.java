/***********************************************************************************************************

JAVA - Como Programar by Paul Deitel, Harvey Deitel 

	Capítulo 3 Introdução a classes, objetos, métodos e strings

* Crie uma classe chamada Date que inclui três informações como variáveis de instância - um
 * mês (tipo int), um dia (tipo int) e um ano (tipo int). Sua classe deve ter um construtor
 * que inicializa as três variáveis e assumir que os valores fornecidos são corretos. Forneça
 * um método set e um get para cada variável de instância. Forneça um método displayDate que
 * exibe o mês, o dia e o ano separados por barras normais (/). Escreva um aplicativo de teste
 * camando DateTest que demonstra as capacidades da classe Date.



*************************************************************************************************************/
import java.util.Scanner;

public class Date{

    // variáveis de instância
    private int mes, dia, ano;
    


  public Date(int mes, int dia, int ano){
    setMes(mes);
    setDia(dia);
    setAno(ano);    

  }

    
  public void displayDate(){
    System.out.printf("%d / %d / %d", getMes(), getDia(), getAno());
  }


   public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes(){
    	return mes;
    }



    public void setDia(int dia){
        this.dia = dia;
    }
    public int  getDia(){
        return dia;
    }


    public void setAno(int ano){
        this.ano = ano;
        
        
        
    }
    public int getAno(){
        return ano;
            }
  
   

   
    
    

    

    

    


}