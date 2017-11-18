
public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Nikolai");
		conta.deposita(100.5);
		conta.saca(400);

		System.out.println(conta.getTitular());
	}
}
