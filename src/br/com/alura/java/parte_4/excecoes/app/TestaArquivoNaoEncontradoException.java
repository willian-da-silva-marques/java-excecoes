package br.com.alura.java.parte_4.excecoes.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

import br.com.alura.java.parte_4.excecoes.exception.ArquivoNaoEncontradoException;

public class TestaArquivoNaoEncontradoException {

	public static void main(String[] args) throws ArquivoNaoEncontradoException {
		Scanner scannerLine = null;
		try (Scanner scanner = new Scanner(new File("arquivo.txt"), StandardCharsets.UTF_8.name())) {
			while (scanner.hasNext()) {
				String nextLine = scanner.nextLine();
				scannerLine = new Scanner(nextLine);
				scannerLine.useLocale(Locale.US);
				String line = scannerLine.next();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			if (!fileNotFound()) {
				throw new ArquivoNaoEncontradoException();
			}
		}
	}
	
	private static boolean fileNotFound() {
		return false;
	}
}
