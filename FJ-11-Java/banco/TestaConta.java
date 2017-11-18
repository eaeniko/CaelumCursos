class TestaConta {

	public static void main(String[] args) {

		Cliente nikolai = new Cliente();
		// nikolai.nome = "Nikolai";
		// nikolai.cpf = "000.429";

		Conta contaNiko = new Conta();

		contaNiko.titular.nome = "Nikolai" ;

		contaNiko.numero = 001;
		contaNiko.deposita(100);
		contaNiko.DataAbertura = "18/11/2017";

		
		// Cliente lucas = new Cliente();
		// lucas.nome = "lucas";
		// lucas.cpf = "000.429";

		// Conta contaLucas = new Conta();

		// contaLucas.titular = lucas ;
		// contaLucas.numero = 001;
		// contaLucas.setSaldo(50);
		// contaLucas.DataAbertura = "18/11/2017";


		Conta contaLucas = contaNiko;

		if (contaNiko == contaLucas) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}


		
		contaNiko.deposita(100);

		System.out.println(contaNiko.recuperaDadosParaImpressao());
		System.out.println(contaLucas.recuperaDadosParaImpressao());


	}
	
}