package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio9 {
// Crie um programa que recebe 10 valores e ao final imprima o maior numero.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int maiorValor = 0;
		
		do {
			System.out.print("Digite um valor: ");
			int valor = entrada.nextInt();
			
			if (valor > maiorValor) {
				maiorValor = valor;
			}
			contador++;
		}while(contador <10);
		
		System.out.printf("O maior valor digitado foi: %d\n", maiorValor);
		
		entrada.close();
	}

}
