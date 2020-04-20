package fundamentos;

public class DesafioFor {
	
	// Fazer uma arvore de "#", fazendo um controlador sem ser numerico

	public static void main(String[] args) {
		
		
		for(String valor = "#"; !valor.equalsIgnoreCase("######"); valor += "#") {
			System.out.println(valor);
						
		}
	}
}
