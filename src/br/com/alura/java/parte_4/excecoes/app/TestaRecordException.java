package br.com.alura.java.parte_4.excecoes.app;

import java.util.Arrays;
import java.util.List;

import br.com.alura.java.parte_4.excecoes.exception.RecordException;

public class TestaRecordException {

	public static void main(String[] args) throws RecordException {
		
		try {
			System.out.println(deveLancarNoSuchElementException());
		} catch (RecordException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String deveLancarNoSuchElementException() throws RecordException {
		List<String> nomes = Arrays.asList("Ana", "Bruna", "Caroline");
		String nome = null;
		for (String s : nomes) {
			if (s.startsWith("A")) {				
				nome = s;
				return nome;
			}
		}
		throw new RecordException();
	}
}
