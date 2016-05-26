package builder.producto;

import builder.producto.secciones.SeccionA;
import builder.producto.secciones.SeccionB;
import builder.producto.secciones.SeccionC;

public class Builder {

	private Producto producto = new Producto();
	
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Producto buildProducto() {
		return new Producto();
	}
	
	public void buildSeccionA(SeccionA seccionA) {
		producto.setSeccionA(seccionA);
		System.out.println("Build seccion A");
	}
	
	public void buildSeccionB(String cve, int value) {
		producto.setSeccionB(new SeccionB(cve, value));
		System.out.println("Build seccion B");
	}
	
	public void buildSeccionC(SeccionC seccionC) {
		System.out.println("Build seccion C");
		producto.setSeccionC(seccionC);
	}

}
