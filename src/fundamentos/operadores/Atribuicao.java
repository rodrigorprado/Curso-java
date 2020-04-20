package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		
		c = c + b; // ou posso fazer c += b;
		c = c - a; // ou posso fazer c -= a;
		c = c * b; // ou posso fazer c *= b;
		c = c / a; // ou posso fazer c /= a;
		c = c % 2; // ou posso fazer c %= 2; (O Resultado sera 0 se par e 1 se impar)
		
		System.out.println(c);
		
	}

}
