package OO.composicao.desafio;

public class DesafioTeste {	
		
	// Criar 1 cliente
	// 2 Compras
	// 2 Itens com produtos diferentes
	
	public static void main(String[] args) {
		// Definindo o cliente
		Cliente c1 = new Cliente("Rodrigo"); 
		// Definindo os produtos que serão comprados
		Produto p1 = new Produto ("Celular", 2059.99);
		Produto p2 = new Produto ("Laptop", 3449.68);
		Produto p3 = new Produto ("Mouse", 59.99);
		Produto p4 = new Produto ("Fone sem Fio", 999.99);
		// Definindo os itens de compra (produto e qtidade)
		Item i1 = new Item (p1, 2);
		Item i2 = new Item (p4, 2);
		Item i3 = new Item (p2, 5);
		Item i4 = new Item (p3, 5);
		// Adicionando os itens na 1ª compra e calculando o total da mesma
		Compra compra1 = new Compra ();
		compra1.adicionarItem(i1);
		compra1.adicionarItem(i2);
		double totalCompra1 = compra1.totalCompra();
		//Adicionando os itens na 2ª compra e e calculando o total da mesma
		Compra compra2 = new Compra();
		compra2.adicionarItem(i3);
		compra2.adicionarItem(i4);
		double totalCompra2 = compra2.totalCompra();
		// Vinculando as compras ao comprado
		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);
		// Imprimindo os resultados
		System.out.printf("O valor da Compra 1 é de R$ %.2f!", totalCompra1);		
		System.out.printf("\nO valor da Compra 2 é de R$ %.2f!", totalCompra2);
		System.out.printf("\n%s gastou o total de R$ %.2f com as compras!",c1,c1.totalGasto());
		
		
		
		
	}
	

}
