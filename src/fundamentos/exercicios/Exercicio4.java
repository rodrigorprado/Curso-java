package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {
/*	Criar um programa que receba um numero e diga se ele e
 *  um numero primo.
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		int primo = 0;
		for(int i=2; i<=(num/2);i++)
			if (num % i == 0) {
				primo++;
				break;
				}
		
		if (primo == 0) {
			System.out.printf("O número %d é primo!", num);
		}else {
			System.out.printf("O número %d não é primo!", num);
		}
		
		entrada.close();
	}

}
