package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.14;
	/* quando utilizamos "final" nós "bloqueamos" a
	 * variável para que ela não seja alterada.
	 * Por convenção, as variáveis finais são em MAIÚSCULAS!
	 */
	
	AreaCirc(double raioInicial) {		
		raio = raioInicial;
	}
	
	double area () {
		
		return Math.pow(raio, 2) * PI;
	}

}
