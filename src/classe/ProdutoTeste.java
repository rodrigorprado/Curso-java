package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 1000);
		
		// Definindo uma variavel do tipo produto
		// Como a classe Produto esta dentro do mesmo pacote, nao preciso importar
		// Desconto é estatico, então não preciso atribuir valor à ele.		
		
				
		System.out.println(p1.nome);
		double precoFinal1 = p1.precoComDesconto();
		System.out.println(precoFinal1);
				
		var p2 = new Produto ();
		// Para usar o construtor padrao, tenho que cria-lo caso eu crie outro construtor
		p2.nome = "Caneta Preta";
		p2.preco = 100;
		Produto.desconto = 0.3;
		// Tem 25% de desconto, mas quero aumentar para 30%
		
		
		System.out.println(p2.nome);		
		double precoFinal2 = p2.precoComDesconto();
		System.out.println(precoFinal2);
		
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Media do carrinho = R$%.2f", mediaCarrinho);
				
	}

}
