package mediador.elements;

import mediador.Mediador;

public class SalaEspera implements Elemento {

	Mediador mediador;
	
	public SalaEspera(Mediador med) {
		mediador = med;
	}
	

	public void setInformacion(Object info) {
		// TODO Auto-generated method stub
		
	}


	public void ocurreEvento() {
		mediador.updateStateSala();
	}


}
