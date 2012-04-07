package facade;

import facade.sistemaa.SistemaA;
import facade.sistemaa.impl.SistemaAImpl;
import facade.sistemab.SistemaB;
import facade.sistemab.impl.SistemaBImpl;

public class Facade implements SistemaA, SistemaB {

	private SistemaA sistemaA;
	private SistemaB sistemaB;
	
	public Facade() {
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
