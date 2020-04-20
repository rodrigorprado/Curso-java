package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ola pessoal".charAt(0));
		
		String s = "Boa tarde"; // Não é possível modificar o valor original de uma string
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa")); //Retorna V ou F
		// NEste caso, retorna V porque a string "s" inicia com "Boa".
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.equalsIgnoreCase("boa tarde")); //Ignora maiusculas e minusculas
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome:" + sobrenome); // adicionando "\n" pulo uma linha
		
		System.out.printf("O funcionario %s %s tem %d anos e ganha R$ %.2f\n\n", nome, sobrenome, idade, salario);
		// Da maneira acima, conseguimos pedir para substituir partes do texto por valores de variaveis.
		// Os valores substituem da maneira: %s = String %d = Inteiros %f flutuantes
		// Se adicionar %.2f eu limito as casas decimais em 2. Alterando o valor depois do ponto, eu altero o numero de casas
		
		System.out.println("Frase qualquer".substring(6)); //Comeca a printar a partir do caracter 6 includindo ele
		System.out.println("Frase qualquer".substring(6, 9)); //Comeca a printar no caracter pedido e para um antes do indicado como final
		}

}
