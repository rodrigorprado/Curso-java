package fundamentos.operadores;

public class DesafioOpLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terca (V ou F)
		// Trabalho na quinta (V ou F)
		// Se os dois trabalhos forem confirmados, comprarei uma TV de 50"
		// Se apenas um deles der certo, comprarei uma TV de 32"
		// Comprando uma ou outra, tomarei sorvete no shopping
		// Se nenhum dos trabalhos der certo, ficarei em casa
		
				
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		// Comprando a TV de 50"
		boolean tv50 = trabalho1 && trabalho2;
		
		System.out.println("Comprei a TV de 50? " + tv50);
		
		// Comprando a TV de 32"
		
		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("Comprei a TV de 32\" " + tv32);
		// Quando quero colocar " no comentario, tenho que colocar \"
				
		// Tomando Sorvete
				
		boolean sorvete = tv50 || tv32;
				
		System.out.println("Tomei sorvete no shopping? " + sorvete);
				
		// Fiquei mais saudavel? (Sem tomar sorvete?)
								
		boolean maisSaudavel = !sorvete;
				
		System.out.println("Fiquei mais saudavel? " + maisSaudavel);
			
				
		
		
	}

}
