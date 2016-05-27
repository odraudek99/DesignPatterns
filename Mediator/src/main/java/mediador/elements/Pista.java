package mediador.elements;

import mediador.Mediador;

public class Pista implements Elemento {

	Mediador mediador;

	Pista(Mediador med) {
		mediador = med;
	}
	
	

	public void setInformacion(Object info) {
		System.out.println("Recupera info para actualizar pista");
	}


	public void ocurreEvento() {
		mediador.updateStatePista();
	}

	
	

	
}
