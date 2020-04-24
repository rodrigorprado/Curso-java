package classe;

public class Usuario {
	
	String nome;
	String email;
	
	// Implementando o equals para realizar as comparações de objetos por valor.
	public boolean equals(Object objeto) {
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual;
			
		} else {
			return false;
		}
		/* Com esta estrutura, caso eu tente comparar algo que não é
		 * instancia de "Usuario" o resultado será falso.
		 */
	}

}

// Hashcode será abordado em outra aula!