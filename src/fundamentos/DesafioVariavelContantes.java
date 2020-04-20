package fundamentos;

public class DesafioVariavelContantes {
	//Converter Temperatura de Fahrenheit para Celcius
	
	public static void main(String[] args) {
		
		// (F - 32) x 5/9 = C
		final int C1 = 32;
		final double c2 = (5/9.0); // ou (5.0/9) ou (5.0/9.0)
		// Se eu dividir inteiros, o resultado sempre dara inteiro.
		// Portanto, preciso colocar ".0" pelo menos em um dos numeros da divisao.
		double fahrenheit = 32;
		double celcius = (fahrenheit - C1) * c2;
		
		System.out.println("A temperatura " + fahrenheit + " F equivale a " + celcius + " C");
	
		fahrenheit = 120;
		celcius = (fahrenheit - C1) * c2;
		
		System.out.println("A temperatura " + fahrenheit + " F equivale a " + celcius + " C");
	}

}
