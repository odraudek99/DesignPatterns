package adapter.test;

import adapter.Adapter;

public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.apagaSistemaA();
		adapter.enciendeSistemaA();
		adapter.apagaSistemaB();
		adapter.calientaSistemaB();
	}

}
