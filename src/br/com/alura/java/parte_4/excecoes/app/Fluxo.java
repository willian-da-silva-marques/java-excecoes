package br.com.alura.java.parte_4.excecoes.app;

import br.com.alura.java.parte_4.excecoes.exception.MyFirstException;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Início do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MyFirstException e) {
			if (e instanceof ArithmeticException)
				System.out.println("ArithmeticException: [" + e.getMessage() + "]");
			else if (e instanceof NullPointerException)
				System.out.println("NullPointerException: [" + e.getMessage() + "]");
			else
				System.out.println("MyFirstException: [" + e.getMessage() + "]");
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MyFirstException {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MyFirstException {
		System.out.println("Início do metodo2");
		throw new MyFirstException("Congratulations!! You capitured your first exception customized!");
//		throw new ArithmeticException("Impossível realizar divisão por 0.");
//		throw new NullPointerException("Referência está nula.");
	}
}