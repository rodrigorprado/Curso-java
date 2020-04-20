package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc (5.6);
		
		System.out.println(a.area());
		
		/* Para acessar e alterar o valor de Pi,
		 * tenho que alterar diretamente na classe, fazendo:
		 * AreaCirc.Pi = novo valor;
		 * Fazemos isso quando h� uma constante que ser� utilizada
		 * em v�rias inst�ncias. Dessa maneira, reduzo o uso de
		 * mem�ria.
		 */
	}

}
