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
			System.out.print("Tente adivinhar o n�mero escolhido de 0 a 100: ");
			int numDigitado = entrada.nextInt();
			
			if (i == 10) {
				System.out.println("GAME OVER!");
				System.out.println("\n\nO n�mero escolhido era " + numGerado);
				break;
			}else if(numDigitado == numGerado) {
				System.out.print("\nPARAB�NS! VOC� ACERTOU!!!");
				break;
			}else if(numDigitado > numGerado) {
				System.out.print("\nO n�mero digitado � MAIOR que o n�mero escolhido!\n");
			}else {
				System.out.print("\nO n�mero digitado � MENOR que o n�mero escolhido!\n");
			}
			 int tentativa = 10 - i;
			System.out.printf("N�mero de tentativas restantes: %d\n\n" ,tentativa);
			i++;
			
		}while (i<=10);
		
		entrada.close();
	}

}
