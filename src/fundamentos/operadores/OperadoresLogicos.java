package fundamentos.operadores;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // E
		System.out.println(condicao1 || condicao2);// OU
		System.out.println(condicao1 ^ condicao2);// XOU
		System.out.println(!condicao1); // NAO
		
		// Tabela verdade E
		
		System.out.println("\nTabela Verdade E");		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// Tabela verdade OU
		
				System.out.println("\nTabela Verdade OU");		
				System.out.println(true || true);
				System.out.println(true || false);
				System.out.println(false || true);
				System.out.println(false || false);
				
		// Tabela verdade OU EXCLUSIVO
				
				System.out.println("\nTabela Verdade OU EXCLUSIVO");		
				System.out.println(true ^ true);
				System.out.println(true ^ false);
				System.out.println(false ^ true);
				System.out.println(false ^ false);
				
	  // Tabela verdade NAO
				
				System.out.println("\nTabela Verdade NAO");		
				System.out.println(!true);
				System.out.println(!false);
				System.out.println(!!true);
				System.out.println(!!false);
		
		
	}

}
