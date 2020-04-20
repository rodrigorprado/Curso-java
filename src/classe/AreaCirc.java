package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.14;
	/* quando utilizamos "final" n�s "bloqueamos" a
	 * vari�vel para que ela n�o seja alterada.
	 * Por conven��o, as vari�veis finais s�o em MAI�SCULAS!
	 */
	
	AreaCirc(double raioInicial) {		
		raio = raioInicial;
	}
	
	double area () {
		
		return Math.pow(raio, 2) * PI;
	}

}
