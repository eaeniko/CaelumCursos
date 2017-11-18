class Conta {
	Cliente titular;
	int numero;
	int agencia;
	private double saldo;
	String DataAbertura;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void saca(double valor) {

		if (this.saldo >= valor) {
			
			this.saldo -= valor;

		} 
	}
	void deposita(double valor) {
		this.saldo += valor;
	}


	double calculaRendimento() {
		return this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular.nome;
		dados += "\nNumero: " + this.numero;
		dados += "\nData de Abertura: " + this.DataAbertura;
		dados += "\nSaldo com Bonus: " +this.saldo;
		dados += "\nRendimento Mensal: "+ this.calculaRendimento();

		return dados;
	}
}


