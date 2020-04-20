package fundamentos;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String conceito = "";
		System.out.print("Informe a nota do aluno: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
// Como o conceito dos cases 10 e 9 são os mesmos, posso agrupá-los
		
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "D";
			break;
// Posso agrupá-los na mesma linha ou não
		default:
			conceito = "não encontrado!";
		}
		
		System.out.println("Conceito é: " + conceito);
		entrada.close();
	}
	
}
