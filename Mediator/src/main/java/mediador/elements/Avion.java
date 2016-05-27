package mediador.elements;

import mediador.Mediador;

public class Avion implements Elemento {

	Mediador mediador;
	

	public void setInformacion(Object info) {
		// TODO Auto-generated method stub
		
	}


	public void ocurreEvento() {
		mediador.updateStateSala();
	}

}
