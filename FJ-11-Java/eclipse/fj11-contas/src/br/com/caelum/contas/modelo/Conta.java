package br.com.caelum.contas.modelo;

/**
 * Classe que gerencia as contas do sistema
 * @author Nikolai
 * 
 */
public abstract class Conta {
	private String titular;
	private String agencia;
	private String dataAbertura;
	protected double saldo;
	private int numero;
	
	public abstract String getTipo();
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * método que devolve o saldo da conta
	 * @return o saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Método que incrementa o saldo da conta
	 * @param valor o valor a ser depositado
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void saca(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		}
		
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	
}
