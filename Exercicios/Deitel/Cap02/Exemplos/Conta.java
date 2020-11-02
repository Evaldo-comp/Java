/***********************************************************************************************************

	JAVA - Como Programar by Paul Deitel, Harvey Deitel 

*Capitulo 2 - Introdução a aplicativos java - Esntrada/saída e operadores

Figura 3.1: Account.java
Classe Account que contém uma variável de instância name
e métodos para configurar e obter seu valor.

OBS: Esse exemplo contém algumas alterações

*************************************************************************************************************/


public class Conta{

	private String name, genero; // variáveis  de instância
	private int idade;
	// método para definir o nome do objeto
	public void setName(String name){
		this.name = name; // armazena o nome
	}


	// método para definir a idade
	public void setAge(int idade){
		this.idade = idade; // armazena o nome
	}

	// método para definir o gênero
	public void setGen(String genero){
		this.genero = genero;

	}

	// método paa recuperar o nome do objeto
	public String getName(){
		return name;
	}

	// método paa recuperar a idade do objeto
	public int getAge(){
		return idade;
	}

	// método paa recuperar o gênero do objeto
	public String getGen(){
		return genero;
	}


}