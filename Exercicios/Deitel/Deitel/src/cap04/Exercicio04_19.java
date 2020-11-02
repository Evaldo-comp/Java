package cap04;


/*
 * (Calculador de comissão de vendas) Uma grande empresa paga seu pessoal 
 * de vendas com base em comissões. O pessoal de vendas recebe R$ 200 por 
 *semana mais 9% de suas vendas brutas durante esse período.  Por exemplo,
 * um vendedor que realiza um total de vendas de mercadorias de R$ 5.000 
 * em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. 
 * Foi-lhe fornecida uma lista dos itens vendidos por cada vendedor. 
 * Os valores desses itens são como segue:
 * 
 * Item     Value
	1        239.99
	2        129.75
	3        99.95
	4        350.89

 */

public class Exercicio04_19 {
	
	private int item;
	private float salario, Total;
	private String nome;
	
	void setTotal(float Total) {
		this.Total = Total;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getNome() {
		return nome;
	}
	
	void setSalario(float salario) {
		this.salario = salario;
	}
	
	double getSalario() {
		return (0.09 * Total) + 200.00;
		
	}
	
	// inicio da classe main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Exercicio04_19  comissao = new Exercicio04_19();
		java.util.Scanner input = new java.util.Scanner(System.in);
		int item, qtd;
		float Total = 0;
		int cont =1;
		String nome;
		while (cont == 1) {
			
			
			System.out.println("Digite seu nome");
			nome = input.nextLine();
			
				comissao.setNome(nome);
				System.out.println("Digite o item e a quantidade");
				item = input.nextInt();
				qtd = input.nextInt();
				
				
			
				
				if (item == 1) {
					Total +=  239.99 * qtd;
				}else if (item == 2) {
					Total += 129.75 * qtd;
				}else if (item == 3) {
					Total += 99.95 * qtd;
				}else if(item == 4 ) {
					Total += 350.89;
				}else {
					System.out.println("Valor inválido insira um item de 1 a 4%n");
				}
				
			comissao.setTotal(Total);
			System.out.printf("%s Seu salário será de R$ %.2f%n", comissao.getNome(), comissao.getSalario());
			
			System.out.println("Ou Digite 2 para sair ou 1 para cotinuar");
			cont = input.nextInt();
			input.nextLine();
				
			}
			
			
		}
		
		
	}


