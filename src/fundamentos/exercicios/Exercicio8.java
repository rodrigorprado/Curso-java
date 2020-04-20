package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio8 {
// Criar um programa que receba uma palavra e imprime no console letra por letra.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		
		while(!palavra.equalsIgnoreCase("Sair")) {
			
			int qtd = palavra.length();
			
			for(int i=0; i<qtd; i++) {
				System.out.println(palavra.charAt(i));
			}
			System.out.print("\nDigite uma palavra: ");
			palavra = entrada.next();
		}
				
		entrada.close();
	}
}
