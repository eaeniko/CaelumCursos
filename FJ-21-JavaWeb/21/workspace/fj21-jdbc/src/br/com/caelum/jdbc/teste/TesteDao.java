package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteDao {

	public static void main(String[] args) {
		

		//adicionando dados de um novo contato
		Contato testeContato = new Contato();
		
		
		testeContato.setNome("Niko");
		testeContato.setEmail("agencianiko@gmail.com");
		testeContato.setEndereco("Rua alguma coisa 394");
		testeContato.setDataNascimento(Calendar.getInstance());

		//grave os dados nessa conexão
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(testeContato);
		System.out.println("Gravou uhul");
	}

}
