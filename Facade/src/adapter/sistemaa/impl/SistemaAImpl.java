package adapter.sistemaa.impl;

import adapter.sistemaa.SistemaA;

public class SistemaAImpl implements SistemaA {

	
	public void apagaSistemaA() {
		System.out.println("apagaSistemaA");
	}

	@Override
	public void recibeInstruccionA() {
		System.out.println("recibeInstruccionA");
	}

	@Override
	public void enciendeSistemaA() {
		System.out.println("enciendeSistemaA");
	}

}