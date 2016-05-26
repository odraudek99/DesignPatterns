
package adapter;

import adapter.adap.Pollito;
import adapter.adap.impl.PollitoImpl;
import adapter.adaptable.Paloma;


public class AdapterPollito implements Paloma {

	private Pollito pollito;
	
	
	public AdapterPollito() {
		pollito = new PollitoImpl();
	}
	
	public AdapterPollito(Pollito pollito) {
		this.pollito = pollito;
	}
	

	public void vuela() {
		System.out.print("Adapter Paloma:: ");
		pollito.brinca();
	}


	public void come() {
		System.out.print("Adapter Paloma:: ");
		pollito.pica();
	}


	public void gorgorea() {
		System.out.print("Adapter Paloma:: ");
		pollito.pio();
	}

}
