package br.com.alura.java.parte_4.excecoes.exception;

public class ArquivoNaoEncontradoException extends Exception {

	private static final long serialVersionUID = -1333717684724333216L;

	private static final String message = "Arquivo não encontrado exception!";

	public ArquivoNaoEncontradoException() {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
