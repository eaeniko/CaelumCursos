package br.com.caelum.jdbc.dao;

import java.util.List;

import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getLista();
		
		for (Contato listaContato : contatos) {
			System.out.println("Nome: " + listaContato.getNome());
			System.out.println("Email: " + listaContato.getEmail());
			System.out.println("Endereco: " + listaContato.getEndereco());
			System.out.println("Data de Nascimento: " + listaContato.getDataNascimento().getTime() + "\n");
			
		}
	}
}
