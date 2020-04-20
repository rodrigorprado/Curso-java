package fundamentos;

public class Break01 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) {
			
			if (i ==5) {
				break; // Quando chega no 5, o break faz o codigo sair do loop
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}

}
