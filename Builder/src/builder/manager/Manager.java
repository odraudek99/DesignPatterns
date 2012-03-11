package builder.manager;

import builder.producto.Builder;
import builder.producto.Producto;
import builder.producto.secciones.SeccionA;
import builder.producto.secciones.SeccionC;

public class Manager {
	
	
	private Builder builder;
	
	public Producto buildProducto() {
		
		builder.buildProducto();
		
		builder.buildSeccionA(new SeccionA());
		builder.buildSeccionB("forma", 1);
		builder.buildSeccionC(new SeccionC());
		
		return builder.getProducto();
		
	}

}
