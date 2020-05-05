package OO.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> listaCompra = new ArrayList<Compra>();
	
	Cliente (String nome){
		this.nome = nome;
	}
	
	void adicionarCompra (Compra compra) {
		this.listaCompra.add(compra);
	}
	
	public String toString() {
		return nome;
	}
	
	double totalGasto () {
		double totalGeral = 0;
		for (Compra compras: listaCompra) {
			totalGeral += compras.totalCompra();
		}
		return totalGeral;
	}
	
	
	
	//Lista de Compras.
	
	//Metodo para calcular o total gasto

}
