class TestaConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		c1.titular = "Nikolai";
		c1.numero = 001;
		c1.saldo = 50;
		c1.DataAbertura = "18/11/2017";

		Conta c2 = c1;

		if (c1 == c2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}


		
		c1.deposita(100);

		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c2.recuperaDadosParaImpressao());


	}
	
}