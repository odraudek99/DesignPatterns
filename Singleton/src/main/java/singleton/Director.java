package singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Director {

	private static Director instance = new Director();
	
	private Director() {}

	public static Director getInstance() {
		return instance;
	}

	
	private String nombre;
	private List<String> titulos = Collections.synchronizedList(new ArrayList<String>());
	
	
	public String getTitulo() {
		return titulos.remove(titulos.size() - 1);
	}
	public void addTitulo(String titulo) {
		titulos.add(titulo);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
}
