package mediador.elements;

import mediador.Mediador;

public class Avion implements Elemento {

	Mediador mediador;
	
	@Override
	public void setInformacion(Object info) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ocurreEvento() {
		mediador.updateStateSala();
	}

}
