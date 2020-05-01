package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		/* Algumas vezes eu terei filas com tamanho limitado.
		 * Neste caso, quando eu add com "offer" e o elemento
		 * n�o couber na fila, ser� retornado "false".
		 * Se eu add com "add" numa fila limitada e o elemento
		 * n�o couber, o c�digo vai dar erro.
		 */
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.add("Guilherme");
		
		/* Tamb�m h� duas maneiras de pegar um elemento da fila.
		 * Se eu utilizar o "peek" e a fila estiver vazia, ser�
		 * retornado o valor "null".
		 * Se eu utilizar o "element" e a fila estiver vazia
		 * o c�digo vai dar erro.
		 * Ambos obt�m o pr�ximo elemento da fila SEM REMOVER.
		 */
		System.out.println(fila.peek());		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
//		fila.clear(); -> Limpar a fila
//		fila.size(); -> Retorna o tamanho da fila (qntidade de elementos)
//		fila.isEmpty(); -> Verifica se a fila est� vazia
//		fila.contains (); -> Verificar se tal elemento est� contido na fila
		
		// Com o "poll", eu retorno o pr�ximo elemento da fila e removo ele.
		/* Posso remover tanto com "pool" quanto com "remove".
		 *  Quando utilizo "pool" e a fila est� vazia, retorna "null".
		 *  J� utilizando "remove", em caso de fila vazia, o c�digo
		 *  vai retornar um erro.
		 */
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
				
	}

}
