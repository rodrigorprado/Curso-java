package fundamentos;

import java.util.Scanner;


public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		// Ler num 1
		// Ler num 2
		// Qual operacao o usuario quer?
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		String valor1 = entrada.nextLine().replace("," , ".").trim();
		
		System.out.println("\nDigite o segundo numero: ");
		String valor2 = entrada.nextLine().replace("," , ".").trim();
		
		System.out.println("\nEscolha o tipo de operação (+ ou - ou * ou / ou % ): \n");
		String operador = entrada.nextLine().trim();
		
		entrada.close();
		
		// Convertendos as strings de valores em numeros
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		// Resolvendo todas as operacoes
		
		Double soma = num1 + num2;
		Double subtracao = num1 - num2;
		Double multiplicacao = num1 * num2;
		Double divisao = num1 / num2;
		Double modular = num1%num2;
		
		
		//Calculando o resultado
		
		String resultado = 		"+".equals(operador) ? soma.toString() : 
						  			"-".equals(operador) ? subtracao.toString() : 
						  				"*".equals(operador) ? multiplicacao.toString() : 
						  					"/".equals(operador) ? divisao.toString() : 
						  						"%".equals(operador) ? modular.toString() : "Operacao invalida";
					
		
		System.out.printf("O resultado de %s %s %s é %s", valor1, operador, valor2, resultado);
				
	}

}
