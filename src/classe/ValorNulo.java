package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		String s2 = null;
		System.out.println(s2.concat("???"));
		// Como a variável é nula, não conseguimos imprimir o "s2".
	}

}
