package mediador.elements;

import mediador.Mediador;

public class ServiciosAuxilio implements Elemento {

	Mediador mediador;

	public ServiciosAuxilio(Mediador med) {
		mediador = med;
	}
	
	@Override
	public void setInformacion(Object info) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ocurreEvento() {
		mediador.updateStateServicios();
		
	}

}
