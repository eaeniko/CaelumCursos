class Academia {

	public static void main(String[] args) {
		String nome = "Thiago";
		int idade = 25;
		float peso = 90.5f;
		double altura = 1.8;
		double imc = peso / (altura * altura);
		boolean fumante = false;  // true ou false
		char Sexo = 'M';
		boolean amigoDoDono = false;

	System.out.println("IMC:" + imc);

		if(idade > 18 || amigoDoDono) {
			System.out.println("Pode matricular!");
		} else {
			System.out.println("Não pode matricular");
		}

		for (int i = 0; i < 3; i++) {

			if (i==1) {
				continue;
			}
			peso += 2; //peso = peso + 2;  
			System.out.println(peso);
		}
	}
	

}