package arrays;

public class ForEach {
	
	public static void main(String[] args) {
		
		double [] notas = {9.9, 8.7, 7.2, 9.4};
		
		/*Com a estrutura abaixo, já fica entendido que vou passar por
		 * todos elementos do array.
		 */
		double total = 0;
		for(double nota: notas) {
			System.out.println(nota);
			total +=nota;
		}
		System.out.println("Média das notas: " + total/notas.length);
	}

}
