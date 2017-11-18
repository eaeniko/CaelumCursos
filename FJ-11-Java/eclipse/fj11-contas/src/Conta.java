
public class Conta {
	private String titular;
	private String agencia;
	private String dataAbertura;
	private double saldo;
	private int numero;
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
	public double getSaldo() {
		return saldo;
	}
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}
	public void saca(int valor) {
		// TODO Auto-generated method stub
		if (saldo >= valor) {
			saldo -= valor;
		}
		
	}
	
	
	
}
