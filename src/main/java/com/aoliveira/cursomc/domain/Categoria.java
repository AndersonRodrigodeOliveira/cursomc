package com.aoliveira.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable {
	/**
	 * Implementa Serializable que possibilita o objeto ser
	 * convertido em uma sequência de bytes, para gravar em arquivos,
	 * trafegar em rede e etc.
	 */
	private static final long serialVersionUID = 1L;
	
	// Atributos
	private Integer id;
	private String nome;
	
	//Associações
	
	// Construtores
	public Categoria() {
		
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

    // getters and // setters
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    // hashCode and Equals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
