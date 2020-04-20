package fundamentos.operadores;



public class DesafioOpAritmeticos {
	
	public static void main(String[] args) {
		
		 int a = (int) Math.pow((6 * (3 + 2)), 2)/(3*2); // Calculando a primeira parte
		 		
		 int b = (int) Math.pow((((1-5)*(2-7))/2), 2); // Calculando a segunda parte
		 		 
		 int c = (int) Math.pow((a-b), 3); // Calculando o dividendo
		 
		 int resultado = c/ (int) Math.pow(10, 3); // Finalizando a equacao
		 
		 System.out.println("O resultado da equacao e " + resultado);
	}

}
