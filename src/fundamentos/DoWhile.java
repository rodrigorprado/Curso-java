package fundamentos;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		do {
			
			System.out.println("Você precisa falar as palavras mágicas!");
			System.out.println("Quer sair? ");
			valor = entrada.nextLine();
		} while (!valor.equalsIgnoreCase("por favor")); //Unica estrutura de controle que uso ";" no final
		
		System.out.println("Obrigado!");
		
		
		entrada.close();
	}

}
