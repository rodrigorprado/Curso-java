package OO.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro ();
		
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelear();
		c1.acelear();
		c1.acelear();
		c1.acelear();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());
		
		//Rela��o bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
	}

}
