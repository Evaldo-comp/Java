public class Produto{

	public String name;
	public double preco;
	public int  quantidade;


	// Método de Entrada
	public void Entrada(String name, double preco, int quantidade){
		this.name = name;
		this.preco = preco;

		if (quantidade > 0)
		   this.quantidade += quantidade;
	}

	// Método de retirada
	public void Saida(String name, double preco, int quantidade){
		this.name = name;
		this.preco = preco;

		if (quantidade > 0)
		   this.quantidade -= quantidade;
		else
			System.out.println("Impossível fazer retirada, quantidade em estoque insuficiente");
	}


	public double valorTotal(){
		return getQuantidade() * getPreco();
	}

	public String getNome(){
		return name;
	}


	public double getPreco(){
		return preco;
	}


	public  int getQuantidade(){
		return quantidade;
	}

}