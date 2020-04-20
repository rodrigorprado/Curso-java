package arrays;

import java.util.Scanner;

public class Desafio {
	
	/* Criar um programa em que o usuário entra com a quantidade de notas que deseja computar.
	 * Então, pedir para que ele entre com todas as notas, somar e mostrar a média final
	 * utilizando um laço "for" e outro "foreach".
	 */
	
	public static void main(String[] args) {		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quantas notas você deseja informar? ");
		int q = entrada.nextInt();
		double [] notas = new double [q];
				
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("\nInforme com a %dª nota: ", i+1);
			notas[i] = entrada.nextDouble();
			
		}
				
		double totalNotas = 0;
		for (double nota: notas) {
			totalNotas += nota;
		}
		double media = totalNotas/notas.length;
		System.out.println("A média das notas é: " + media);
				
		entrada.close();
	}

}
