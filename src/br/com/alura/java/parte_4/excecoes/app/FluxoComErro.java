package br.com.alura.java.parte_4.excecoes.app;

public class FluxoComErro {

	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
		metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("In�cio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	@SuppressWarnings("unused")
	private static void metodo2() {
		int i = 0;
		System.out.println("In�cio do metodo2");
		/* Esse bloco while provocar� um java.lang.StackOverflowError */
//		while(i < 40) {
//			metodo2();
//			i++;
//		}
		System.out.println("Fim do metodo2");
	}
}