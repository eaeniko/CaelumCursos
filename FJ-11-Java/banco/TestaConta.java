class TestaConta {

	public static void main(String[] args) {

		Conta contaNiko = new Conta();
		contaNiko.titular = "Nikolai";
		contaNiko.numero = 001;
		contaNiko.saldo = 5000;

		Conta contaJef = new Conta();
		contaJef.titular = "Jefferson";
		contaJef.numero = 002;
		contaJef.saldo = 3000;


		contaNiko.deposita(400);
		contaJef.deposita(900);
		
		contaNiko.saca(900);

		


		System.out.println(contaNiko.titular);
		System.out.println(contaNiko.saldo);


	}
	
}