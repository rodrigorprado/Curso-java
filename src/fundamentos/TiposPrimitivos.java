package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informacoes do funcionario
		
		// Tipos numericos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_236_455_387L; 
		//Posso utilizar underline para separar numeros como se fosse o ponto
		// Preciso colocar um "L" no final do numero de um long, quando o tamanho for maior que a capacidade do inteiro
		
		// Tipos numericos reais
		
		float salario = 11_445.44F;
		// Preciso colocar um "F" no final do numero de um float, quando quero informar que e float para o Java
		
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		
		boolean estaDeFerias = false; //or true
		
		// Tipo caracteres
		
		char status = 'A'; //So posso colocar 1 caractere. No exemplo "A" = ativo
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa*365);
		
		// Numeros de Viagens
		
		System.out.println(numeroDeVoos/2);
		
		// Pontos por real
		
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id+": ganha ->"+ salario);
		System.out.println("Ferias? "+ estaDeFerias);
		System.out.println("Status do Funcionario: " + status);
	}

}
