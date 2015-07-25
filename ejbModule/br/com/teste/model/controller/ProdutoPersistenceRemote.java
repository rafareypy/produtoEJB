package br.com.teste.model.controller;

import java.util.List;

import javax.ejb.Remote;
import javax.xml.bind.annotation.XmlElement;

import br.com.teste.model.Produto;


@Remote
public interface ProdutoPersistenceRemote {

	public Produto inserir(Integer uid, String nome, Double valor);
	
	public Produto update(Integer uid, String nome, Double valor);
	
	public Produto find(Integer uid);
	
	public void delete(Integer uid);
	
	@XmlElement(name = "produto")
	public List<Produto> findAll();
	
}

