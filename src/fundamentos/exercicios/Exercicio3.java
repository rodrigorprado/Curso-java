package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {
/*	Criar um programa que receba duas notas parciais,
 *  calcular a media final. Se a nota do aluno for maior 
 *  ou igual a 7.0 imprime no console "Aprovado",
 *  se a nota for menor que 7.0 e maior do que 4.0 imprime
 *  no console "Recuperacao", caso contrario 
 *  imprime no console "Reprovado".
 */
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contador = 1;
		double notaParcial = 0;
		double mediaFinal = 0;
		
		while(contador <= 2) {
			System.out.printf("Digite a nota parcial %d: ", contador);
			notaParcial += entrada.nextDouble();
			contador++;
		}
		
		mediaFinal = notaParcial/2.0;
		
		if(mediaFinal >= 7.0) {
			System.out.println("APROVADO!");
		} else if (mediaFinal < 7.0 && mediaFinal >= 4.0) {
			System.out.println("RECUPERAÇÃO!");
		}else {
			System.out.println("REPROVADO!");
		}
		
		entrada.close();
		
	}

}
