package fundamentos;

public class BreakRotulado {
	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {
				
				if (i == 1) {
					break externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();		
		}
		
	}

}
/* Posso dar rotulos aos meus blocos e especificar de qual bloco
eu quero sair ao usar o break. No exemplo acima, para sair do bloco
externo, eu especifiquei rotulando o "for" de "i" */
// NÃO É RECOMENDÁVEL UTILIZAR!
