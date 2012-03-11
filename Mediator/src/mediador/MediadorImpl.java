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
	
	
	@Override
	public void registerAvion(Avion avion) {
		this.avion = avion;
	}
	
	@Override
	public void registerPista(Pista pista) {
		this.pista = pista;
	}
	
	@Override
	public void registerServicios(ServiciosAuxilio serv) {
		this.servicios = serv;
	}
	
	@Override
	public void registerSala(SalaEspera sala) {
		this.sala = sala;
	}
	
	@Override
	public void updateStatePista() {
		sala.setInformacion("Pista actualizada");
		servicios.setInformacion("Pista actualizada");
		avion.setInformacion("Servicios actualizados");
	}
	
	@Override
	public void updateStateSala() {
		pista.setInformacion("Sala actualizada");
		servicios.setInformacion("Sala actualizada");
		avion.setInformacion("Servicios actualizados");
	}
	
	@Override
	public void updateStateServicios() {
		pista.setInformacion("Servicios actualizados");
		sala.setInformacion("Servicios actualizados");
		avion.setInformacion("Servicios actualizados");
	}
	
	@Override
	public void updateStateAvion() {
		pista.setInformacion("Avion actualizado");
		sala.setInformacion("Avion actualizado");
		servicios.setInformacion("Avion actualizado");	
	}
		
}
