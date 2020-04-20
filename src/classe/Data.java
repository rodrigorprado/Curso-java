package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data (){
		
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		// Posso construir com o construtor "this" dentro de outro construtor.
		this(1, 1, 1970);
	}
	
	Data (int dia, int mes, int ano) {
		
		/* Quando temos vari�veis de instancia com o mesmo nome dos
		 * par�metros, temos que usar o "this" para especificar que
		 * aquela vari�vel de instancia espec�fica, est� recebendo
		 * o valor X espec�fico e salvando em uma inst�ncia espec�fica.
		 */
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada () {
		final String formato = "%d/%d/%d"; //constante local (exclusiva deste m�todo)
		return String.format(formato, dia, mes, ano);
		
		/* Outra solucao e transformar as variaveis em Integer
		 * e utilizar o comando var.toString (). Eu fiz assim, mas
		 * acabei convertendo para ficar igual no curso.
		*/
		
	}

}
