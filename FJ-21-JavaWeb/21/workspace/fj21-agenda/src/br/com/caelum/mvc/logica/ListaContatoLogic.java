package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class ListaContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection connection = (Connection) req.getAttribute("conexao");
		ContatoDao dao = new ContatoDao(connection);

		List<Contato> contatos = dao.getLista();
		req.setAttribute("contatos", contatos);
		return "/WEB-INF/lista-contatos.jsp";
	}

}
