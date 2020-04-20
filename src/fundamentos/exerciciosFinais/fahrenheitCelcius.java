package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class fahrenheitCelcius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Fahrenheit: ");
		
		double fahrenheit = entrada.nextDouble();
		
		entrada.close();
		
		double celcius = (fahrenheit - 32) * (5.0/9);
		
		System.out.println("A tempratura " + fahrenheit +"F equivale a " + celcius +"C.");
		
	}

}
