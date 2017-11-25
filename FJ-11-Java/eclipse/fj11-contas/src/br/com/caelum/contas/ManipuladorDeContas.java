package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas extends Conta {
	
	private Conta conta;
	public void criaConta(Evento evento) {
		
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		this.conta = new Conta();
		this.conta.setTitular(evento.getString("titular"));
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
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