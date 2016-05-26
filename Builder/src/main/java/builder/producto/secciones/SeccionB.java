package builder.producto.secciones;

public class SeccionB {
	
	private String variable;
	private int valor;
	
	public SeccionB() {
		
	}
	
	public SeccionB(String cve, int val) {
		this.valor = val;
		this.variable = cve;
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
