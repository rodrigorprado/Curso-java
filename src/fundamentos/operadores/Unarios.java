package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // Incrementar o valor da variavel a = a + 1;
		a--; // Decrementar o valor da variavel a = a - 1;
		
		++b; // A Mesma coisa que acima, so que prefixado
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--);
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
