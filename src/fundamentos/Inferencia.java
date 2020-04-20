package fundamentos;

public class Inferencia {
	
	
	public static void main(String[] args) {
		
		double a = 4.5; // Declaracao e atribuicao de valor da variavel
		System.out.println(a);
		
		var b=4.5; 
		// Se eu declaro a variavel apenas como var, o Java vai inferir e detectar o tipo.
		System.out.println(b);
		
		var c = "Texto";
		
		System.out.println(c);
		
		//Não é possível alterar o tipo da variável, umas vez que ela foi definida
		
		double d; // Declarei a variavel
		d=123.65; // Atribui um valor a variavel declarada
		System.out.println(d);
		
		// Para declaracao "var" não consigo declarar a variavel em uma linha e atribuir valor em outra linha.
			
	}
}
