package br.com.alura.java.parte_4.excecoes.exception;

public class MyFirstException extends Exception {

	private static final long serialVersionUID = 1620447543940222952L;

	private String message;

	public MyFirstException() {
	}

	public MyFirstException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}