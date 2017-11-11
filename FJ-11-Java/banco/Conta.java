class Conta {
	String titular;
	int numero;
	double saldo;


	void deposita(double valor) {
		this.saldo += valor;
	}

	void saca(double valor) {

		if (this.saldo >= valor) {
			
			this.saldo -= valor;

		} 
	}


}


