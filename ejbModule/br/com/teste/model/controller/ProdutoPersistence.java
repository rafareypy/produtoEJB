package br.com.teste.model.controller;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.com.teste.model.Produto;


@Stateless
@LocalBean
public class ProdutoPersistence extends AbstractPersistence implements
		ProdutoPersistenceRemote {

	@Override
	public Produto inserir(Integer uid, String nome, Double valor) {		
		Produto p = new Produto();
		p.setNome(nome);
		p.setValor(valor);		
		super.insert(p);
		return p ;		
		
	}

	@Override
	public Produto update(Integer uid, String nome, Double valor) {
		Produto p = find(uid);
		p.setNome(nome);
		p.setValor(valor);
		super.update(p);
		return p ;		
	}

	@Override
	public Produto find(Integer uid) {
		return super.find(Produto.class, uid);
	}

	@Override
	public void delete(Integer uid) {		
		super.delete(Produto.class, uid);
	}

	@Override
	public List<Produto> findAll() {
		return super.findAll(Produto.class);
	}

}
