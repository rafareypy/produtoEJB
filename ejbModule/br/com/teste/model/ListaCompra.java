package br.com.teste.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lista_compra database table.
 * 
 */
@Entity
@Table(name="lista_compra")
@NamedQuery(name="ListaCompra.findAll", query="SELECT l FROM ListaCompra l")
public class ListaCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="valor_total")
	private double valorTotal;

	//bi-directional many-to-one association to ItemLista
	@OneToMany(mappedBy="listaCompraBean")
	private List<ItemLista> itemListas;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuarioBean;

	public ListaCompra() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ItemLista> getItemListas() {
		return this.itemListas;
	}

	public void setItemListas(List<ItemLista> itemListas) {
		this.itemListas = itemListas;
	}

	public ItemLista addItemLista(ItemLista itemLista) {
		getItemListas().add(itemLista);
		itemLista.setListaCompraBean(this);

		return itemLista;
	}

	public ItemLista removeItemLista(ItemLista itemLista) {
		getItemListas().remove(itemLista);
		itemLista.setListaCompraBean(null);

		return itemLista;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

}