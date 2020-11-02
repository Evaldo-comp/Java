package Exemplos_cap04;

public class Estudante {
	
		private String name;
		private double media;
		
		// construtores que inicializam as variáveis de instância
		public Estudante(String name, double media) {
			this.name = name;
		
		
		     // valida a média
			if (media > 0.0)
				if (media <=100.0)
					this.media = media;
		}
		
		// método set para definir o nome do estudante
		public void setName(String name) {
			this.name= name;
		}
		
		//método para recuperar o nome do estudante
		public String getName() {
			return name;
		}
	
		// método para definir a média do estudante
		public void setMedia(double MediaEstudante) {
			
			if (media > 0.0)
				if (media <= 100.0)
					this.media = media;
					
			}
		
		//método para recuperar a media
		public double getMedia() {
			return media;
		}
		
		//método para retornar a letra correspondente a nota do estudante
		public String getLetterGrade() {
			String letterGrade = "";
			
			if (media >= 90.0)
				letterGrade = "A";
			else if (media>= 80.0)
				letterGrade = "B";
			else if (media>= 70.0)
				letterGrade = "C";
			else if (media>= 60.0)
				letterGrade = "D";
			else
				letterGrade = "F";
			
			return letterGrade;
					
		}
		
}// fim da classe Estudante
