package br.com.alura.java.parte_4.excecoes.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Conta implements Serializable {

	private static final long serialVersionUID = -7587373581713541301L;

	private BigDecimal saldo;
	
	public Conta() {}

	public Conta(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}
}
