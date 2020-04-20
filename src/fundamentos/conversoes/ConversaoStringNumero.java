package fundamentos.conversoes;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
		
		System.out.println(valor1 + valor2); //Aqui nao soma, pois os numeros estao salvos como Strings
		
		double numero1 = Double.parseDouble(valor1); //Convertendo de String pra Double
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A Soma e " + soma);
		System.out.println("A media e " + soma/2);
		
		
	}

}
