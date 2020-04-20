package fundamentos.operadores;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		System.out.println(3 > 4); // maior que
		System.out.println(12 >= 12); // maior ou igual a
		System.out.println(12 < 17); // menor que
		System.out.println(30 <= 5); // menor ou igual a
		System.out.println(20 != 89); // diferente de
		System.out.println(30 == 50); // igual a
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("O Aluno tem desconto? " + temDesconto);
		
		
	}

}
