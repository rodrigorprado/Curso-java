package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//Digito o dia da semana e ele da o numero do dia
		//Domingo -> 1
		//Segunda -> 2
		//Terca -> 3
		//Quarta -> 4
		//Quinta -> 5
		//Sexta -> 6
		//Sabado -> 7
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String Dia = entrada.next();
		
		if(Dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Domingo é o dia 1");
		} else if(Dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Segunda é o dia 2");
		} else if(Dia.equalsIgnoreCase("Terca")) {
			System.out.println("Terca é o dia 3");
		} else if(Dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Quarta é o dia 4");
		}else if(Dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Quinta é o dia 5");
		}else if("Sexta".equalsIgnoreCase(Dia)) {
			System.out.println("Sexta é o dia 6");
			//Posso comparar o text com a variavel ou o contrario
		}else if(Dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Sabado é o dia 7");
		}else {
			System.out.println("Dia invalido!!");
		}
		System.out.println("Fim!!");
		entrada.close();
		
	}
}
