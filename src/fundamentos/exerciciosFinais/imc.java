package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class imc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		
		double peso = entrada.nextDouble();
		
		System.out.print("\nDigite dua altura em m: ");
		
		double altura = entrada.nextDouble();
				
		entrada.close();
		
		
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("\nO seu IMC é %.2f. \n\nConfira abaixo a tabela:\n\n", imc);
		System.out.println("Menor que 18,5 = Abaixo do Peso");
		System.out.println("Entre 18,5 e 24,9 = Peso normal");
		System.out.println("Entre 25 e 29,9 = Sobrepeso");
		System.out.println("Entre 30 e 34,9 = Obesidade grau 1");
		System.out.println("Entre 35 e 39,9 = Obesidade grau 2");
		System.out.println("Mais do que 40 = Obesidade grau 3\n\n");
		
		String imcResult = imc < 18.5 ? "Abaixo do Peso" : "0";
		imcResult = imc >= 18.5 && imc <= 24.9 ? "Peso Normal" : imcResult;
		imcResult = imc > 24.9 && imc <= 29.9 ? "Sobrepeso" : imcResult;
		imcResult = imc > 29.9 && imc <= 34.9 ? "Obesidade grau 1" : imcResult;
		imcResult = imc > 34.9 && imc <= 39.9 ? "Obesidade grau 2" : imcResult;
		imcResult = imc > 39.9 ? "Obesidade grau 3" : imcResult;
		
		System.out.println("De acordo com a tabela, você está em " + imcResult);
		
	}

}
