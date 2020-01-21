package br.com.alura.java.parte_4.excecoes.model;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 3945319566099957649L;

	static Long cod = 0L;
	private Long id;
	private String nome;
	private Integer quantidade;
	
	public Produto(String nome, Integer quantidade) {
		this.id = this.getId();
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public Long getId() {
		this.id = ++cod;
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\ncódigo: ").append(id)
		.append("\nnome: ").append(nome)
		.append("\nquantidade em estoque: ").append(quantidade);
		return sb.toString();
	}
	
	
}
