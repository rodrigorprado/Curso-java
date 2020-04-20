package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class bhaskara {
	
	public static void main(String[] args) {
		
		System.out.println("Encontrando as raizes de uma equacao ax² + bx + c = 0");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor de \"A\":");
		
		double a = entrada.nextDouble();
		
		System.out.println("Entre com o valor de \"B\": ");
		
		double b = entrada.nextDouble();
		
		System.out.println("Entre com o valor de \"C\": ");
		
		double c = entrada.nextDouble();
		
		entrada.close();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		double x1 = (-b + Math.sqrt(delta))/(2.0*a);
		double x2 = (-b - Math.sqrt(delta))/(2.0*a);
		
		System.out.printf("As raizes da equacao ax² + bx + c = 0, sendo A = %.2f, B = %.2f e C= %.2f são X1 = %.2f e X2 = %.2f", a,b,c,x1,x2);
		
				
				
	}

}
