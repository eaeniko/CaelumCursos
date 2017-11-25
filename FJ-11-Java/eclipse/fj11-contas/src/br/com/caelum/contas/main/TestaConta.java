package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;


public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Nikolai");
		conta.deposita(600.5);
		conta.saca(400);

		System.out.println(conta.getTitular());
		System.out.println(conta.getSaldo());
	}
}
