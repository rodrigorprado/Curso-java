package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double [3];
		// Criando um array para armazenas as notas do aluno A
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		/*Para poder imprimir os valores armazenados em um array,
		 * devo importar o Arrays do Java Util e utilizar o comando 
		 * para transformá-los em String e imprimí-los.
		 */
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Percorrendo os valores do array
		//Uso o ".length" porque se alterar o nome do array, o loop "for" se ajusta automaticamente
		double totalA = 0;
		for(int i= 0;i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		
		System.out.println("Média do aluno A é: " + totalA/notasAlunoA.length);
		
		double [] notasAlunoB = {6.9, 8.9, 5.5, 10};
		double totalB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		System.out.println("Média do aluno B é: " + totalB/notasAlunoB.length);
		
	}

}
