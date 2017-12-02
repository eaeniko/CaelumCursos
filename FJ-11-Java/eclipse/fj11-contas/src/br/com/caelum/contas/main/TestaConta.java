package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;


public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente();
		conta.setTitular("Nikolai");
		conta.deposita(600.5);
		conta.saca(400);

		System.out.println(conta.getTitular());
		System.out.println(conta.getSaldo());
		System.out.println(conta);
	}
}
