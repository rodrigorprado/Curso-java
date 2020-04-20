package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	/*	Criar um programa que receba um numero e diga se ele e
	 *  um numero primo, usando "Switch". */	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero para verificar se � primo: ");
		int num = entrada.nextInt();
		int primo = 0;
		
		for(int i=2; i<=(num/2);i++)
			if (num % i == 0) {
				primo++;
				break;
				}
					
		switch (primo) {
		case 0:
			System.out.println("O n�mero " + num + " � primo!");
			break;
		default:
			System.out.println("O n�mero " + num + " n�o � primo!");
		}
				
		entrada.close();
		
	}

}
