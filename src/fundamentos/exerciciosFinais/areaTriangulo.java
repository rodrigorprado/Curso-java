package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class areaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a base do tri�ngulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("\n\nDigite a altura do tri�ngulo: ");
		double altura = entrada.nextDouble();
				
		entrada.close();
		
		double area = (base * altura)/2.0;
		
		System.out.println("A �rea do tri�ngulo � " + area);
	}

}
