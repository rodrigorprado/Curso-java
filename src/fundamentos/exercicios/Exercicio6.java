package fundamentos.exercicios;
import java.util.Random;
import java.util.Scanner;


public class Exercicio6 {
	
	public static void main(String[] args) {
		
		/*Jogo da adivinhacao: Tentar adivinhar um numero entre 0 - 100.
		 *Armazene um numero aleatorio em uma variavel.
		 *O Jogador tem 10 tentativas para adivinhar o numero gerado.
		 *Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e 
		 *imprima se o numero inserido e maior ou menor do que o numero armazenado. */
		
		Random gerador = new Random();
		Scanner entrada = new Scanner (System.in);
		int numGerado = gerador.nextInt(101);
		int i = 1;
		
		do {
			System.out.print("Tente adivinhar o número escolhido de 0 a 100: ");
			int numDigitado = entrada.nextInt();
			
			if (i == 10) {
				System.out.println("GAME OVER!");
				System.out.println("\n\nO número escolhido era " + numGerado);
				break;
			}else if(numDigitado == numGerado) {
				System.out.print("\nPARABÉNS! VOCÊ ACERTOU!!!");
				break;
			}else if(numDigitado > numGerado) {
				System.out.print("\nO número digitado é MAIOR que o número escolhido!\n");
			}else {
				System.out.print("\nO número digitado é MENOR que o número escolhido!\n");
			}
			 int tentativa = 10 - i;
			System.out.printf("Número de tentativas restantes: %d\n\n" ,tentativa);
			i++;
			
		}while (i<=10);
		
		entrada.close();
	}

}
