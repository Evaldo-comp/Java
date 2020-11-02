/***********************************************************************************************************

JAVA - Como Programar by Paul Deitel, Harvey Deitel 

	Capítulo 3 Introdução a classes, objetos, métodos e strings

* Crie uma classe chamada Employee que inclui três partes de informações como variáveis de
 * instância - um primeiro nome (tipo String), um sobrenome (tipo String) e um salário
 * mensal (double). Sua classe deve ter um construtor que inicializa as três variáveis de
 * instância. Forneça um EmployeeTest que demonstra as capacidades da classe Employee. Crie
 * dois objetos Employee e exiba o salário anual de cada objeto. Então dê a cada Employee um
 * aumento de 10% e exiba novamente o salário anual de cada Employee.
 */

import java.util.Scanner;

public class Employee{

    // variáveis de instância
    private String nome;
    private String sobrenome;
    private double salario;


  public Employee(String nome, String sobrenome, double salario){
    setNome(nome);
    setSobrenome(sobrenome);
    setSalario(salario);    

  }

    
  
   public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
    	return nome;
    }



    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }


    public void setSalario(double salario){
        if (salario<0)
            this.salario = 0.0;
        else
            this.salario = salario;
        
        
        
    }
    public double getSalario(){
        return salario;
            }
  
   

   
    
    

    

    

    


}