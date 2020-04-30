package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) // Silenciando as advert�ncias
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet ();
		
		//Vamos cirar um Set heterog�neo, mas n�o � o ideal.
		//� sempre melhor criar collections homog�neas.
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste");
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("teste"); // N�o � uma repeti��o, pois este � com "t".
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); // Se retorna "true", foi poss�vel remover do conjunto.
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains(1.2)); // Verifico se o valor est� contido no meu conjunto
		System.out.println(conjunto.contains("Rodrigo"));
		
		Set nums = new HashSet ();
		// � poss�vel atribuir um HasSet em um Set
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // Adicionando o conjunto "nums" no conjunto "conjunto"
		//System.out.println(conjunto);
		conjunto.retainAll(nums); // Faz a interse��o entre conjuntos
		System.out.println(conjunto);
		
		conjunto.clear(); // Deletando os objetos do conjunto
		System.out.println(conjunto);
	}

}
