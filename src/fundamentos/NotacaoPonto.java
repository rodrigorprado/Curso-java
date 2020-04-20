package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3; // Qndo for tipos primitivos, fica roxo
		String s = "Bom dia X"; // Tem que ser "S" maiusculo
		s= s.replace("X", "Senhora"); // Trocar uma parte do texto por outro
		s= s.toUpperCase(); // Deixar todas as letras maiusculas
		s=s.concat("!!!");
				
		System.out.println(s);
		
		String y = "Bom dia X"				//Uma mesma funcao em
				.replace("X", "Rodrigo")	//mais de uma linha
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		// Tipos primitivos nao tem operador "." como mostrado acima
	}

}
