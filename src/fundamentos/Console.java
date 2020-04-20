package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom"); //Nao separa as linhas porque nao imprime por linha
		System.out.print(" dia!\n\n"); // Para pular de linha tenho que colocar \n
		
		System.out.printf("Megasena %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6); //Print formatado
		
		System.out.printf("Salario: R$ %.1f%n", 1234.5678); //Posso usar %n para quebrar linha tambem
		
		// Captando dados digitados - Temos que importar o Scanner
		
		Scanner entrada = new Scanner(System.in); //System in para captar a entrada de dados do teclado
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine(); //O sistema fica aguardando eu inputar dados tipo String
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine(); //O sistema fica aguardando eu inputar dados para salvar na variavel sobrenome neste caso
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); //Dessa maneira armazeno numeros inteiros
		
		System.out.printf("Nome %s %s Idade: %d%n ", nome,sobrenome, idade);
		
		entrada.close(); //Depois que finalizar o uso de um import, tenho que fechar ele para nao ficar ocupando dados
	}
	
}
