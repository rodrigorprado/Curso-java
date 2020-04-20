package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class celsiusFahrenheit {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a Temperatura em Celcius: ");
		
		double celcius = entrada.nextDouble();
				
		entrada.close();
		
		double fahrenheit = (celcius*(9.0/5)) + 32;
		
		System.out.printf("%.2f C equivale a %.2f F", celcius, fahrenheit);
		
		
	}

}
