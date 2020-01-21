package br.com.alura.java.parte_4.excecoes.exception;

public class InsufficientInventoryException extends Exception {

	private static final long serialVersionUID = 6384816416137132223L;

	private static final String message = "Insufficient inventory";
	
	public InsufficientInventoryException() {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}