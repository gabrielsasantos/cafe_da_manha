package br.com.agenda.aplica��o;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setNome("Maria Gabriela");
		contato.setCpf("111.111.222-03");
		contato.setProduto("P�o com queijo");
		
		contatoDao.save(contato);

		
		
		

	}

}
