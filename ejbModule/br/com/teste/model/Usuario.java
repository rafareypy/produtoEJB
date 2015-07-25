package br.com.teste.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nome;

	//bi-directional many-to-one association to ListaCompra
	@OneToMany(mappedBy="usuarioBean")
	private List<ListaCompra> listaCompras;

	public Usuario() {
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

	public List<ListaCompra> getListaCompras() {
		return this.listaCompras;
	}

	public void setListaCompras(List<ListaCompra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public ListaCompra addListaCompra(ListaCompra listaCompra) {
		getListaCompras().add(listaCompra);
		listaCompra.setUsuarioBean(this);

		return listaCompra;
	}

	public ListaCompra removeListaCompra(ListaCompra listaCompra) {
		getListaCompras().remove(listaCompra);
		listaCompra.setUsuarioBean(null);

		return listaCompra;
	}

}