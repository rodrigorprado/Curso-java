package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		/* Se eu adicionar com "push" e o tamanho da pilha for limitado
		 * acontece erro. Se eu utilizar o "add" retorna o valor falso
		 * caso não seja possível add o elemento na pilha.
		 */
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		// Na pilha, o último a entrar é o 1º a sair.
		// FILO -> First In, Last Out.
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		/* Além de "poll" e "remove", na pilha também temos
		 * "pop", que tem comportamento igual do "remove".
		 */
		
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
	}

}
