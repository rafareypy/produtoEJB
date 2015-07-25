package br.com.teste.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the supermercado database table.
 * 
 */
@Entity
@NamedQuery(name="Supermercado.findAll", query="SELECT s FROM Supermercado s")
public class Supermercado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nome;

	public Supermercado() {
	}

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

}