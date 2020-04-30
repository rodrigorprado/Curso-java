package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) // Silenciando as advertências
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet ();
		
		//Vamos cirar um Set heterogêneo, mas não é o ideal.
		//É sempre melhor criar collections homogêneas.
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste");
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("teste"); // Não é uma repetição, pois este é com "t".
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); // Se retorna "true", foi possível remover do conjunto.
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains(1.2)); // Verifico se o valor está contido no meu conjunto
		System.out.println(conjunto.contains("Rodrigo"));
		
		Set nums = new HashSet ();
		// É possível atribuir um HasSet em um Set
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // Adicionando o conjunto "nums" no conjunto "conjunto"
		//System.out.println(conjunto);
		conjunto.retainAll(nums); // Faz a interseção entre conjuntos
		System.out.println(conjunto);
		
		conjunto.clear(); // Deletando os objetos do conjunto
		System.out.println(conjunto);
	}

}
