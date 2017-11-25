package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	private Conta conta;
	public void criaConta(Evento evento) {
		conta = new Conta();
		conta.setTitular("Batman");
		conta.setAgencia("123-4");
		conta.setNumero(345);
	}
	
	public void deposita(Evento evento) {
		double valorASerDepositado = evento.getDouble("valor");
		conta.deposita(valorASerDepositado);
	}
	public void saca(Evento evento) {
		double valorSaque = evento.getDouble("valor");
		conta.saca(valorSaque);
	}

}
