package fundamentos.conversoes;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString()); //Convertendo numero em String
		
		int num2 = 20000;
		System.out.println(Integer.toString(num2));//Deixo pra converter apenas na saida
		
		System.out.println((""+num2));//Convertendo em String, concatenando o numero com um espaco vazio
	}

}
