package adapter.test;

import adapter.AdapterPollito;
import adapter.adap.Pollito;
import adapter.adap.impl.PollitoImpl;
import adapter.adaptable.Paloma;
import adapter.adaptable.impl.PalomaImpl;

public class AdapterTest {

	public static void main(String args[]) {
		Pollito pollito = new PollitoImpl();
		pollito.pio();
		
		Paloma paloma = new PalomaImpl();
		paloma.gorgorea();
		
		Paloma palomaAdaptada = new AdapterPollito(pollito);
		palomaAdaptada.gorgorea();
		
	}
}
