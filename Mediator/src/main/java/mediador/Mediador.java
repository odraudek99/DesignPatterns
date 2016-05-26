package mediador;


import mediador.elements.Avion;
import mediador.elements.Pista;
import mediador.elements.SalaEspera;
import mediador.elements.ServiciosAuxilio;

public interface Mediador {
	
	public void registerAvion(Avion avion);
	public void registerPista(Pista pista);
	public void registerServicios(ServiciosAuxilio serv);
	public void registerSala(SalaEspera sala);
	
	
	public void updateStateAvion();
	public void updateStatePista();
	public void updateStateSala();
	public void updateStateServicios();

}
