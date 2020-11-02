/***********************************************************************************************************

JAVA - Como Programar by Paul Deitel, Harvey Deitel 

	Capítulo 3 Introdução a classes, objetos, métodos e strings

	(Classe Account modificada) Modifique a classe Account (Figura 3.8) 
	para fornecer um método chamado withdraw que retira dinheiro de uma Account . 
	Assegure que o valor de débito não exceda o saldo de Account . Se exceder, 
	o saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que 
	indica "Withdrawal amount exceeded account balance" [Valor de débito excedeu o 
	saldo da conta] . Modifique a classe AccountTest (Figura 3.9) para testar o método 
	withdraw

 Solução by @evaldo Ago/2020

*************************************************************************************************************/
import java.util.Scanner;

public class Account{

    // variáveis de instância
    private String name;
    private double balance, debito;

    // construtor que recebe três parâmetros
    public Account(String name, double balance, double debito){
    	this.name = name;

    	// Válida o saldo
    	if (balance > 0.0)
    		this.balance = balance;

    	//atualiza o valor do saldo caso o débito for maior que 0
    	if(debito > 0.0)
    		this.balance = balance - debito;
    }

    // método que realiza o depósito
    public void deposito(double depositAmount){
    	if (depositAmount > 0.0)
    		balance = balance + depositAmount;
    }

    // método que retira o dinheiro da conta
    public void debito(double debito){
    	if (debito <=  balance)
    		balance = balance - debito;
    	else
    		System.out.println(" Valor de débito excedeu o saldo da conta");
    }

    // método que retorna o saldo
    public double getBalance(){
    	return balance;
    }

    //método que define o nome
    public void setName(String name){
    	this.name = name;
    }

    // métod que retorna o nome
    public String getName(){
    	return name;
    }

    public double getDebito(){
    	return debito;
    }


}