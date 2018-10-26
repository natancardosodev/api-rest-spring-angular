/**
 * 
 */
package com.natan.gestaoservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author natancardosodev
 *
 */
@Entity
public class Pessoa implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private boolean ativo;
	
	public Pessoa() { }

	/**
	 * @return id para acessar
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id para modificar
	 */
	public void setId(Integer id) {
		this.id = id;
	}



	/**
	 * @return nome para acessar
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome para modificar
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return ativo para acessar
	 */
	public boolean isAtivo() {
		return ativo;
	}

	/**
	 * @param ativo para modificar
	 */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	

}
