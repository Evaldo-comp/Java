/***********************************************************************************************************

JAVA - Como Programar by Paul Deitel, Harvey Deitel 

	Capítulo 3 Introdução a classes, objetos, métodos e strings

(Classe Invoice ) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
número (tipo String ), a descrição (tipo String ), a quantidade comprada de um item (tipo int ) e o preço por item ( double ). Sua
classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de ins-
tância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
preço por item) e depois retorna esse valor como double . Se a quantidade não for positiva, ela deve ser configurada como 0 . Se o preço
por item não for positivo, ele deve ser configurado como 0.0 . Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
capacidades da classe Invoice .
	withdraw

 Solução by @evaldo Ago/2020

*************************************************************************************************************/
import java.util.Scanner;

public class Invoice{

    // variáveis de instância
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    // construtor para incializar as quatro variáveis
    public Invoice(String numero, String descricao, int quantidade, double preco){
    	super();
        setNumero(numero);
        setDesc(descricao);
        setQuantidade(quantidade);
        setPreco(preco);
        

    }

  
    public double getInvoiceAmount(){
            
        return quantidade * preco; 
    	
    } 

    
  
    public String getNumero(){
    	return numero;
    }
  
    public void setNumero(String numero){
        this.numero = numero;
    }

   
    public String getDesc(){
        return descricao;
    }
    
    public void setDesc(String descricao){
        this.descricao = descricao;
    }

   
    public int getQuantidade(){
        if(quantidade < 0)
            this.quantidade = 0;
        else this.quantidade = quantidade;
        return quantidade;
    }

    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
   
   
    public void setPreco(double preco){
        if(preco < 0)
            this.preco = 0;
        else this.preco = preco;
            this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    

    

    

    


}