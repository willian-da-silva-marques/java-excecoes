package br.com.alura.java.parte_4.excecoes.app;

import br.com.alura.java.parte_4.excecoes.model.Conexao;

public class TestaConexao {

	public static void main(String[] args) {
		
		/* Código sem simplificação(legado antes do java 1.7) */
//		Conexao conexaoOne = null;
//		try {			
//			conexaoOne = new Conexao();
//			conexaoOne.lerDados();
//		} catch (IllegalStateException iae) {
//			System.out.println("Mensagem da exception");
//		} finally {
//			if (conexaoOne != null) {				
//				System.out.println("finally");
//				conexaoOne.fechar();
//			}
//				
//		}
		
		/* Código simplificação(a partir do java 1.7) */
		try (Conexao conexaoTwo = new Conexao()){
			conexaoTwo.lerDados();
		} catch (IllegalStateException e) {
			System.out.println("Mensagem da exception");
		}
	}
}
