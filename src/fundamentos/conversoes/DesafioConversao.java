package fundamentos.conversoes;

import java.util.Scanner;

//Criar Scanner, para inputar 3 Strings que serao valores de salarios e calcular media de salario
public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro salario");
		String valor1 = entrada.nextLine().replace(",", "."); //Captando o primeiro salario e caso o usuario use "," ao inves de ponto, ja arrumo.
		
		System.out.println("Digite o valor do segundo salario");
		String valor2 = entrada.nextLine().replace(",", "."); //Captando o segundo salario
		
		System.out.println("Digite o valor do terceiro salario");
		String valor3 = entrada.nextLine().replace(",", "."); //Captando o terceiro salario
		
		entrada.close();
		
		// Convertendo em double os valores String
		
		double salario1 = Double.parseDouble(valor1); 
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3)/3;
		
		System.out.println("A media salarial é: R$ " + media);
		
		
	}

}
