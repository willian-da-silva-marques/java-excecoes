package br.com.alura.java.parte_4.excecoes.app;

import br.com.alura.java.parte_4.excecoes.exception.InsufficientInventoryException;
import br.com.alura.java.parte_4.excecoes.model.Produto;

public class TestInsufficientInventory {

	public static void main(String[] args) {
		Produto produto = new Produto("Farinha de Trigo", 0);
		try {
			realizarCompra(produto);
		} catch (InsufficientInventoryException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void realizarCompra(Produto produto) throws InsufficientInventoryException {
		if (produto.getQuantidade() <= 0)
			throw new InsufficientInventoryException();
		else
			System.out.println("Compra realizada com sucesso!");
	}

}
