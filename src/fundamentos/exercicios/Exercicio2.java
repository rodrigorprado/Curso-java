package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
//Verificar se o ano digitado é bissexto ou não!
/* Para ser bissexto, o ano deve:	
 * Ser divisível por 4*/
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o ano atual: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
					System.out.println("O ano atual é BISSEXTO!");
				
		} else {
			System.out.println("O ano atual não é BISSEXTO!");
		}
		
		entrada.close();
		
	}

}
