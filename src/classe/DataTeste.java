package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();		
				
		var d2 = new Data(19, 5, 1993);		
		//d2.dia = 5;
		//d2.mes = 9;
		//d2.ano = 2005;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}

}
