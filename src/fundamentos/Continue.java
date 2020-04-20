package fundamentos;

public class Continue {
	

	public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) {
			
			if (i %2 == 1) {
				continue; // Dessa maneira, o codigo não imprime os valores impares
				// O continue so pausa a repeticao que for verdadeira
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}

