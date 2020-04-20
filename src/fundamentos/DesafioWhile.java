package fundamentos;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double total = 0.0;
		double nota = 0.0;
		int contador = 0;
		
		while(nota != -1) {
			
			System.out.print("Digite a nota do aluno de 0 a 10 ou digite -1 para calcular a media: ");
			
			nota = entrada.nextDouble();
			
			if (nota <=10 && nota >= 0) {
				total += nota;
				contador++;
				
			} else if (nota != -1){
				System.out.println("Nota invalida!");
			} 
			
		}
		entrada.close();
		System.out.println("A média de notas é: " + total/contador);
		
		
		
	}

}
