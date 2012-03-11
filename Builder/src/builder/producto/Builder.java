package builder.producto;

import builder.producto.secciones.SeccionA;
import builder.producto.secciones.SeccionB;
import builder.producto.secciones.SeccionC;

public class Builder {

	private Producto producto;
	
	
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
	}
	
	public void buildSeccionB(String cve, int value) {
		producto.setSeccionB(new SeccionB(cve, value));
	}
	
	public void buildSeccionC(SeccionC seccionC) {
		producto.setSeccionC(seccionC);
	}

}
