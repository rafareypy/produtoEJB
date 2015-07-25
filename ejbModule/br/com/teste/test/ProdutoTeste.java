package br.com.teste.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import javax.naming.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.teste.model.Produto;
import br.com.teste.model.controller.ProdutoPersistenceRemote;

public class ProdutoTeste {

	private ProdutoPersistenceRemote produtoPR ;
	
	
	@Before
	public void setUp() throws Exception {
		Context context = null ;
		produtoPR = null ;
		try {
			context = JNDILookupClass.getInitialContext();
			produtoPR = (ProdutoPersistenceRemote) context
							.lookup("ejb:produtoEAR/produtoEJB/ProdutoPersistence!br.com.teste.model.controller.ProdutoPersistenceRemote");			
		} catch (Exception e) {
			System.out.println("Erro ao buscar EJB");
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testInserir(){
		assertEquals("test", "test");
		
		Produto p = produtoPR.inserir(1, "test", 2.3);
		assertNotNull(p);
//		if(p != null){
//			assertEquals(p.getNome(), "test");
//		}
	}

}
