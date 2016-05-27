package mediador.elements;

import mediador.Mediador;

public class ServiciosAuxilio implements Elemento {

	Mediador mediador;

	public ServiciosAuxilio(Mediador med) {
		mediador = med;
	}
	

	public void setInformacion(Object info) {
		// TODO Auto-generated method stub
		
	}


	public void ocurreEvento() {
		mediador.updateStateServicios();
		
	}

}
