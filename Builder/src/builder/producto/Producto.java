package builder.producto;

import builder.producto.secciones.SeccionA;
import builder.producto.secciones.SeccionB;
import builder.producto.secciones.SeccionC;

public class Producto {

	private SeccionA seccionA;
	private SeccionB seccionB;
	private SeccionC seccionC;
	
	public Producto() {
		System.out.println("Constructor Producto");
	}
	
	public SeccionA getSeccionA() {
		return seccionA;
	}
	public void setSeccionA(SeccionA seccionA) {
		this.seccionA = seccionA;
	}
	public SeccionB getSeccionB() {
		return seccionB;
	}
	public void setSeccionB(SeccionB seccionB) {
		this.seccionB = seccionB;
	}
	public SeccionC getSeccionC() {
		return seccionC;
	}
	public void setSeccionC(SeccionC seccionC) {
		this.seccionC = seccionC;
	}

}
