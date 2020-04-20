package fundamentos;

import java.util.Scanner;

public class Wrappers {
	
	public static void main(String[] args) {
		
				
		// Comandos para transformar variaveis primitivas em objetos
		
		// Reais
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L; //Coloco "L" no final para informar que e long
		
		Integer w = Integer.parseInt("200"); // Transformando uma String em um Inteiro
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(w);
		System.out.println(l/3);
		
		//Boolean
		
		Boolean bo = Boolean.parseBoolean("true"); //Converter String para Booleano
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Converter Booleano para String e deixando tudo em maiusculo
		
		// Caractere
		
		Character c ='#'; // char
		System.out.println(c + "....");
		
		// Float
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 12345.6754;
		System.out.println(d);
		
		
	}

}
