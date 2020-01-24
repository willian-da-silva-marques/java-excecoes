package br.com.alura.java.parte_4.excecoes.exception;

public class RecordException extends Exception {

	private static final long serialVersionUID = 2038813739946116820L;
	
	private final String message = "Record not found";

	public RecordException() {
		
	}

	public RecordException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}