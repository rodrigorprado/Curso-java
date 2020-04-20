package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		// Declarando variavel (tipo + nome + valor)
		double raio = 3.4;// A variavel raio � do tipo real e tem valor 3.4
		final double PI = 3.14159;
		/* 
		 * Quando eu quiser que o valor de uma variavel n�o seja
		 * alterado, eu escrevo "final" na frente do tipo.
		 * Dessa maneira, o valor n�o pode ser alterado.
		 * 
		 * Quando temos uma constante, colocamos o nome da constante em
		 * MAIUSCULO!!!
		 */
		
		// Calculando a area
		double area = PI*raio*raio;
		
		//O atalho para o comando abaixo � syso + control + espa�o
		System.out.println(area);
		
		raio = 10;
		area = PI*raio*raio;
		// Quando eu quiser concatenar texto e valores, coloco o "+"
		System.out.println("Area = " + area +" m2");
	}

}
