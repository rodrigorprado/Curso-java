package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class exercicioPotencia {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = entrada.nextDouble();
		
		entrada.close();
		
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("O número %.2f elevado a 2 é %.2f e elevado a 3 é %.2f.", num, quadrado, cubo);
		
	}

}
