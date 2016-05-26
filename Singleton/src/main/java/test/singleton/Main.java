package test.singleton;

import singleton.Director;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Obtener una nueva instancia de esta clase es imposible.
		 */
		// Director instance2 = new Director();
		
		Director instance = Director.getInstance();
		
		instance.addTitulo("Dr.");
		instance.addTitulo("Mr.");
		instance.setNombre("Eduardo Granados");
		
		
	}

}
