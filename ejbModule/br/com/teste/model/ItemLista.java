package br.com.teste.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the item_lista database table.
 * 
 */
@Entity
@Table(name="item_lista")
@NamedQuery(name="ItemLista.findAll", query="SELECT i FROM ItemLista i")
public class ItemLista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer produto;

	//bi-directional many-to-one association to ListaCompra
	@ManyToOne
	@JoinColumn(name="lista_compra")
	private ListaCompra listaCompraBean;

	public ItemLista() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProduto() {
		return this.produto;
	}

	public void setProduto(Integer produto) {
		this.produto = produto;
	}

	public ListaCompra getListaCompraBean() {
		return this.listaCompraBean;
	}

	public void setListaCompraBean(ListaCompra listaCompraBean) {
		this.listaCompraBean = listaCompraBean;
	}

}