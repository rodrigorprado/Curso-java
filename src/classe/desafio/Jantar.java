package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		/* Instanciar uma pessoa, duas comidas e a pessoa comer.
		 * Mostrar peso da pessoa antes e depois de comer. */
		
		Pessoa p1 = new Pessoa("João", 87.70);
		
		System.out.println(p1.intro());
						
		Comida c1 = new Comida("Arroz", 0.3);		
		p1.comer(c1);
		System.out.println(p1.intro());
		
		Comida c2 = new Comida ("Carne", 0.3);
		p1.comer(c2);
		System.out.println(p1.intro());
		
		
		
	}

}
