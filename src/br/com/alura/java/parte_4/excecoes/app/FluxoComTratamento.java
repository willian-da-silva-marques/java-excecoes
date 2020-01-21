package br.com.alura.java.parte_4.excecoes.app;

import br.com.alura.java.parte_4.excecoes.model.Conta;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			if (e instanceof ArithmeticException)
				System.out.println("ArithmeticException: [" + e.getMessage() != null ? "Imposs�vel realizar divis�o por 0." : "" + "]");
			else
				System.out.println("NullPointerException: [" + e.getMessage() != null ? "Refer�ncia est� nula." : "" + "]");
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("In�cio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	@SuppressWarnings({ "unused", "null" })
	private static void metodo2() {
		System.out.println("In�cio do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			
			int a = i / 0;
			Conta conta = null;
			conta.getSaldo();
		}
		System.out.println("Fim do metodo2");
	}
}