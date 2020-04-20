package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribui��o por valor (primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data (1, 6, 2022);
		Data d2 = d1; // Atribui��o por Refer�ncia (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		// As duas vari�veis apontam pro mesmo ponto.
		
		voltarDataPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	//Um metodo estatico s� consegue acessar outro m�todo estatico
	static void voltarDataPadrao (Data d) {
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo (int a) {
		a++;
	}

}
