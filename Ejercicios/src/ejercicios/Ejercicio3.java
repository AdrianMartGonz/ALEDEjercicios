package ejercicios;

public class Ejercicio3 {
	
	private String lazo;
	private int numero;
	private Ejercicio3 ejercicio;
	
	public String getLazo( ) {
		return this.lazo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static void main(String[] args) {
		Ejercicio3 ejercicio = new Ejercicio3();
		System.out.print(ejercicio.getLazo());
	}
	
	
	
}
