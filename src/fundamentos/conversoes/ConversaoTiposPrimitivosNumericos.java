package fundamentos.conversoes;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // Conversao implicita, pois 1 e inteiro.
		System.out.println(a);
		
		float b = (float) 1.0; // Se nao fizermos CAST (conversao) ou colocar "F" no final, estariamos armazenando o valor como double e nao float
		System.out.println(b);
		
		int c= 4;
		byte d = (byte) c; // Se nao fizermos cast, da erro, pois o Java analisa o tipo e nao se o valor cabe
		System.out.println(d);
		/* Se eu colocar um valor na variavel c que nao caiba em uma variavel byte
		 * o valor final nao sera o desejado*/
		
		double e= 1.99999;
		int f = (int) e; //Convertendo tipo float para inteiro, o Java trunca o valor. Ele nao arredonda
		
		System.out.println(f);
		
		
	}
	

}
