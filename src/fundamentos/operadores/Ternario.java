package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 6.6;
		String resultadoParcial = media >= 5.0 ? "em recuperacao." : "reprovado.";
		String resultado = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		// Nos operadores ternarios, eu pergunto o que seria a resposta (?) e dou as opcoes de resultado (:)
		// So consigo escolher entre dois valores
		
		System.out.println("O aluno esta " + resultado);
		
	}

}
