package facade.test;

import facade.Facade;

public class FacadeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Facade adapter = new Facade();
		adapter.apagaSistemaA();
		adapter.enciendeSistemaA();
		adapter.apagaSistemaB();
		adapter.calientaSistemaB();
	}

}
