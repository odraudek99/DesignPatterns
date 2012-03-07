package adapter;

import adapter.sistemaa.SistemaA;
import adapter.sistemaa.impl.SistemaAImpl;
import adapter.sistemab.SistemaB;
import adapter.sistemab.impl.SistemaBImpl;

public class Adapter implements SistemaA, SistemaB {

	private SistemaA sistemaA;
	private SistemaB sistemaB;
	
	public Adapter() {
		sistemaA = new SistemaAImpl();
		sistemaB = new SistemaBImpl();
	}
	
	public void calientaSistemaB() {
		System.out.print("adapter: ");
		sistemaB.calientaSistemaB();
	}

	
	public void apagaSistemaB() {
		System.out.print("adapter: ");
		sistemaB.apagaSistemaB();		
	}

	
	public void apagaSistemaA() {
		System.out.print("adapter: ");
		sistemaA.apagaSistemaA();
	}

	
	public void recibeInstruccionA() {
		System.out.print("adapter: ");
		sistemaA.recibeInstruccionA();
	}

	
	public void enciendeSistemaA() {
		System.out.print("adapter: ");
		sistemaA.enciendeSistemaA();
	}

}
