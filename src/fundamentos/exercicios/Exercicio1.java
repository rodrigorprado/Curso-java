package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {
// Verificar se o n�mero digitado est� entre 0 e 10 e se � par!	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		double num = entrada.nextDouble();
		
		if(num >=0 && num <=10) {
			System.out.println("O numero digitado est� entre 0 e 10");
			if(num % 2 == 0) {
				System.out.println("O numero e PAR!!!");
			}
		}else {
			System.out.println("O n�mero digitado n�o atende os requisitos!");
		}
		
		entrada.close();
		
	}

}
