package builder.manager;

import builder.producto.Builder;
import builder.producto.Producto;
import builder.producto.secciones.SeccionA;
import builder.producto.secciones.SeccionC;

public class Manager {
	
	
	public static Producto buildProducto(Builder builder) {
		
		
		builder.buildSeccionA(new SeccionA());
		builder.buildSeccionB("forma", 1);
		builder.buildSeccionC(new SeccionC());
		
		return builder.getProducto();
		
	}
	
	public static void main(String args[]) {
		Builder builder = new Builder();
		Producto producto = Manager.buildProducto(builder);
		System.out.println("Producto: " + producto.toString());
		
		
	}

}
