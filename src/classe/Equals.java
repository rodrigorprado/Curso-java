package classe;

import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario ();
		u1.nome = "Rodrigo Prado";
		u1.email = "rodrigo.prado@email.com";
		
		Usuario u2 = new Usuario ();
		u2.nome = "Rodrigo Prado";
		u2.email = "rodrigo.prado@email.com";
		
		System.out.println(u1 == u2);
		/*Esta compara��o ser� falsa, pois quando comparamos
		 * objetos desta maneira, o Java compara o endere�o
		 * de aloca��o de mem�ria.
		 */
		
		System.out.println(u1.equals(u2));
		
		System.out.println(u2.equals(new Date ()));
		// Se n�o tivesse o if no "Usuario", daria erro.
				
		
		
	}

}
