package fundamentos.operadores;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3); // Podemos fazer diretamente dentro da saida
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		// Divisao de variaveis tipo int sempre retorna um resultado tipo int
		// No caso sa divisao, o correto seria fazer um cast (conversao) em uma das variaveis
		
		System.out.println(a / (double) b);
		
		// Operador Modulo (%) - Retorna o resto da divisao
		
		System.out.println(a % b);
		
		// Elevando o numero a alguma potencia
		
		int c = (int) Math.pow(b, 3); 
		
		// Elevando a variavel b a 3
		// O Resultado de "Math.pow" sera sempre tipo double.
		// Caso queremos armazenar o resultado numa variavel inteira, precisamos realizar cast.
	
		System.out.println(c);
		
	}

}
