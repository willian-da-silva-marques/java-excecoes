package br.com.alura.java.parte_4.excecoes.model;

public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Abrindo conexão");
		throw new IllegalStateException();
	}
	
	public void lerDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	
	public void fechar() {
		System.out.println("Fechando conexão");
	}

	@Override
	public void close() {
		this.fechar();
	}
}
