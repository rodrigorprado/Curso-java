package OO.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	final ArrayList<Item> itensCompra = new ArrayList<Item>();
	
	void adicionarItem (Item item) {
		this.itensCompra.add(item);
		
	}
	
	double totalCompra () {
		double total = 0;
		for(Item item: itensCompra) {
			total+= item.produto.preco * item.quantidade;
		}
		return total;
	}
	
	//Lista de itens
	// Obter Valor total de compra

}
