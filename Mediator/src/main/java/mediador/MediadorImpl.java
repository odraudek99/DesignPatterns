package mediador;

import mediador.elements.Avion;
import mediador.elements.Pista;
import mediador.elements.SalaEspera;
import mediador.elements.ServiciosAuxilio;

public class MediadorImpl implements Mediador {

	private Pista pista;
	private SalaEspera sala;
	private ServiciosAuxilio servicios;
	private Avion avion;
	
	

	public void registerAvion(Avion avion) {
		this.avion = avion;
	}
	

	public void registerPista(Pista pista) {
		this.pista = pista;
	}
	

	public void registerServicios(ServiciosAuxilio serv) {
		this.servicios = serv;
	}
	

	public void registerSala(SalaEspera sala) {
		this.sala = sala;
	}
	

	public void updateStatePista() {
		sala.setInformacion("Pista actualizada");
		servicios.setInformacion("Pista actualizada");
		avion.setInformacion("Servicios actualizados");
	}
	

	public void updateStateSala() {
		pista.setInformacion("Sala actualizada");
		servicios.setInformacion("Sala actualizada");
		avion.setInformacion("Servicios actualizados");
	}
	

	public void updateStateServicios() {
		pista.setInformacion("Servicios actualizados");
		sala.setInformacion("Servicios actualizados");
		avion.setInformacion("Servicios actualizados");
	}
	

	public void updateStateAvion() {
		pista.setInformacion("Avion actualizado");
		sala.setInformacion("Avion actualizado");
		servicios.setInformacion("Avion actualizado");	
	}
		
}
