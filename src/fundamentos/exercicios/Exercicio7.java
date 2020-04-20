package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio7 {
/*Criar um programa que enquanto estiver recebendo numeros positivos,
 * imprime no console a soma dos numeros inseridos,
 * caso receba um numero negativo, encerre o programa.
 * Tente utilizar a estrutura do while. */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num = 0.0;
		double soma = 0.0;
		
		while (num >= 0.0) {
			System.out.print("Entre com um  número POSITIVO para SOMAR ou NEGATIVO para SAIR: ");
			num = entrada.nextDouble();
			if (num >=0) {
			soma += num;
			System.out.printf("\nValor somado até o momento: %.2f\n", soma);
			}
		}
		
		System.out.println("FIM!");
		entrada.close();
	}

}
