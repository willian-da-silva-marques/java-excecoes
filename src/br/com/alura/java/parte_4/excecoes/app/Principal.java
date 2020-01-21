package br.com.alura.java.parte_4.excecoes.app;

public class Principal {

	public static void main(String[] args) {

		String nome = "Alura";

		System.out.println("ANTES");

		String[] vogais = new String[5];
		vogais[0] = "a";
		vogais[1] = "e";
		vogais[2] = "i";
		vogais[3] = "o";
		vogais[4] = "u";

		try {
			char c = nome.charAt(4);
			System.out.println(c);
			String vogal = vogais[6];
			System.out.println(vogal);
		} catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			if (e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("message: " + e.getMessage());
			else
				System.out.println("message: " + e.getMessage());
		}
	}
}