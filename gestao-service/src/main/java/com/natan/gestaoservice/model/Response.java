package com.natan.gestaoservice.model;
/**
 * 
 */

/**
 * @author natancardosodev
 *
 */
public class Response {
	
	private int codigo;
	
	private String mensagem;

	/**
	 * @param codigo
	 * @param mensagem
	 */
	public Response(int codigo, String mensagem) {
		this.codigo = codigo;
		this.mensagem = mensagem;
	}

	/**
	 * @return codigo para acessar
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo para modificar
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return mensagem para acessar
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * @param mensagem para modificar
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
