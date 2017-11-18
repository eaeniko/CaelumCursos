class TestaConta {

	public static void main(String[] args) {

		Cliente nikolai = new Cliente("Nikolai", "000.429");
		// nikolai.setNome("Nikolai");
		// nikolai.setCpf("000.429");

		Conta contaNiko = new Conta();
		contaNiko.setTitular(nikolai);


		contaNiko.setNumero(001);
		contaNiko.deposita(100);
		contaNiko.setDataAbertura("18/11/2017");

		
	
	Cliente lucas = new Cliente("Lucas", "011.001");
		// lucas.setNome("lucas");
		// lucas.setCpf("000.429");

		Conta contaLucas = new Conta();
		contaLucas.setTitular(lucas);


		contaLucas.setNumero(002);
		contaLucas.deposita(50);
		contaLucas.setDataAbertura("18/11/2016");


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