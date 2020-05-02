package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		// Para add elementos no "map", usamos o "put".
		
		usuarios.put(1, "Rodrigo");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rebeca");
		usuarios.put(4, "Rafael");
		
				
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); // Pego os valores de referência
		System.out.println(usuarios.values()); // Pego o valor atribuido a cada referência
		System.out.println(usuarios.entrySet()); // Pego os dois ao mesmo tempo.
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rodrigo"));
		
		System.out.println(usuarios.get(2));
		System.out.println(usuarios.remove(1)); // Removendo através da chave
		System.out.println(usuarios.remove(2, "Lucas")); // Só remove se ambas informações forem verdadeiras. Neste caso, vai retornar false e não removerá
		
		
		// Percorrendo valores num Map
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
			// Por chave
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
			// Por valor
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
			// Por chave e valor
			// Tem que importar a interface do "Entry"
		}
		
		
	}

}
