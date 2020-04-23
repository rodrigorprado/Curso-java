package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Defina a quantidade de alunos: ");
		int i = entrada.nextInt();
		System.out.print("\nDefina a quantidade de notas de cada aluno: ");
		int j = entrada.nextInt();
		
		
		double notasAlunos[][] = new double [i][j];
		double total = 0;
		
		for (int k = 0;k < notasAlunos.length; k++) {
			
			for (int n = 0; n < notasAlunos[k].length; n++) {
				System.out.printf("Informe a %dª nota do %dº aluno: ", n+1, k+1);
				
				notasAlunos[k][n] = entrada.nextDouble();
				total += notasAlunos[k][n];
			}
			
		}
		double media = total / (i * j);
		System.out.println("A média da turma é " + media);
		
		entrada.close();
	}

}
