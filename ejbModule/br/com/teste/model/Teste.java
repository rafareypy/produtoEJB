package br.com.teste.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the teste database table.
 * 
 */
@Entity
@NamedQuery(name="Teste.findAll", query="SELECT t FROM Teste t")
public class Teste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nome;

	public Teste() {
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