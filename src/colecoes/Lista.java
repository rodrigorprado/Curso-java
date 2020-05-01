package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario ("Carlos"));
		lista.add(new Usuario ("Lia"));
		lista.add(new Usuario ("Bia"));
		lista.add(new Usuario ("Manu"));
		/* Posso criar o usuário e adicioná-lo na lista
		 * ou criá-lo já na lista
		 */
		
		System.out.println(lista.get(3)); // Imprimindo o 3º Usuário através do Hashcode
		// Não é possível acessar pelo índice usando "Set".
		System.out.println("Nome removido: " + lista.remove(1).nome);
		lista.remove(new Usuario("Manu"));
		// Posso remover usuários por índice ou objeto
		
		System.out.println("Está contido no conjunto? " + lista.contains(new Usuario("Lia")));
		// Verificando se tal elemento está contido na minha lista
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}

}
