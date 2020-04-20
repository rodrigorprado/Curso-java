package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	// Desconto de 25% para todos os produtos
	
	Produto (String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	Produto () {
		
	}
	
	double precoComDesconto () {
		// Nao recebo nenhum parametro, pois os dados
		//que preciso, estao na mesma classe (Preco e Desconto)
		
		
		return preco * (1 - desconto);
	}

}
