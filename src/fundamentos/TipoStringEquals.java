package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		String s = new String ("2");
		
		System.out.println("2" == s); // O Resultado e falso
		
		System.out.println("2".contentEquals(s)); // Dessa maneira eu estou comparando conteudo dentro da uma string
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		
		System.out.println("2" == s2.trim()); // .trim() retira os espacos
		System.out.println("2".equals(s2.trim()));
		
		// Portanto, quando vou comparar strings, tenho que usar o equals
		// o next ja tira os espacos em braco, mas o nextLine nao
		
		entrada.close();
	}

}
