package classe;

public class Usuario {
	
	String nome;
	String email;
	
	// Implementando o equals para realizar as compara��es de objetos por valor.
	public boolean equals(Object objeto) {
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual;
			
		} else {
			return false;
		}
		/* Com esta estrutura, caso eu tente comparar algo que n�o �
		 * instancia de "Usuario" o resultado ser� falso.
		 */
	}

}

// Hashcode ser� abordado em outra aula!