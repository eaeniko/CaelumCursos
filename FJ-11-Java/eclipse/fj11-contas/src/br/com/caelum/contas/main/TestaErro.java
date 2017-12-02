package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	static void metodo2() {
		System.out.println("inicio do metodo2");
		ContaCorrente cc = new ContaCorrente();
			for (int i = 0; i <= 15; i++) {
				try {
					cc.deposita(i +100);
					System.out.println(cc.getSaldo());
					if (i == 5) {
						cc = null;
					}
				} catch (NullPointerException e) {
					System.out.println("erro:" +e);
 			}
		}
		System.out.println("fim do metodo2");
	}
}
