package builder.producto.secciones;

public class SeccionA {
	
	private String variable;
	private int valor;
	
	public SeccionA() {
		
	}
	
	public SeccionA(String cve, int val) {
		this.valor = val;
		this.variable = cve;
		System.out.println("Build seccion A");
	}
	
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
