package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		/* Se eu adicionar com "push" e o tamanho da pilha for limitado
		 * acontece erro. Se eu utilizar o "add" retorna o valor falso
		 * caso n�o seja poss�vel add o elemento na pilha.
		 */
		livros.add("O Pequeno Pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		// Na pilha, o �ltimo a entrar � o 1� a sair.
		// FILO -> First In, Last Out.
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		/* Al�m de "poll" e "remove", na pilha tamb�m temos
		 * "pop", que tem comportamento igual do "remove".
		 */
		
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
	}

}
