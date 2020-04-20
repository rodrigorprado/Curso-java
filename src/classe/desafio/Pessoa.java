package classe.desafio;

public class Pessoa {
	
	// Nome
	// Peso
	// Metodo comer (peso da comida)
	// Peso da pessoa = peso da pessoa + peso da comida
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
		
	void comer (Comida comida) {
		
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}
	
	String intro() {
		
		return "Sou " + nomePessoa + " e peso " + pesoPessoa + "KG."; 
	}

}
