package Exemplos_cap04;

public class EstudanteTeste {

	public static void main(String[] args) {
		Estudante conta1 = new Estudante("Evaldo", 89.0);
		Estudante conta2 = new Estudante("Ana", 90.0);
		
		System.out.printf("%s Letter grade is: %s%n",
				conta1.getName(), conta1.getLetterGrade());
		
		System.out.printf("%s Letter grade is: %s%n",
				conta2.getName(), conta2.getLetterGrade());

	}

}// fim da classe EstudanteTeste
