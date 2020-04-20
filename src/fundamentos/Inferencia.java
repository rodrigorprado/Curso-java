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
		
		//N�o � poss�vel alterar o tipo da vari�vel, umas vez que ela foi definida
		
		double d; // Declarei a variavel
		d=123.65; // Atribui um valor a variavel declarada
		System.out.println(d);
		
		// Para declaracao "var" n�o consigo declarar a variavel em uma linha e atribuir valor em outra linha.
			
	}
}
