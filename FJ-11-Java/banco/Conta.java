class Conta {
	private Cliente titular;
	private int numero;
	private int agencia;
	private double saldo;
	private String DataAbertura;

 	public void setTitular(Cliente titular){
 		this.titular = titular;
 	}
 	public Cliente getTitular() {
 		return this.titular;
 	}
	public String getDataAbertura() {
		return this.DataAbertura;
	}
	public void setDataAbertura(String DataAbertura) {
		this.DataAbertura = DataAbertura;
	}
	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		 this.agencia = agencia;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		 this.numero = numero;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saca(double valor) {

		if (this.saldo >= valor) {
			
			this.saldo -= valor;

		} 
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}


	public double getRendimento() {
		return this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular.getNome();
		dados += "\nNumero: " + this.numero;
		dados += "\nData de Abertura: " + this.DataAbertura;
		dados += "\nSaldo com Bonus: " +this.saldo;
		dados += "\nRendimento Mensal: "+ this.getRendimento();

		return dados;
	}
}


