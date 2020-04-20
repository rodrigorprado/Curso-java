package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {
// Verificar se o número digitado está entre 0 e 10 e se é par!	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		double num = entrada.nextDouble();
		
		if(num >=0 && num <=10) {
			System.out.println("O numero digitado está entre 0 e 10");
			if(num % 2 == 0) {
				System.out.println("O numero e PAR!!!");
			}
		}else {
			System.out.println("O número digitado não atende os requisitos!");
		}
		
		entrada.close();
		
	}

}
