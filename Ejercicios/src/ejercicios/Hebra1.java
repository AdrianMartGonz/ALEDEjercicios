package ejercicios;

import java.time.LocalDate;

public class Hebra1 extends Thread {
	
	int numero;
	String nombre;
	
	public Hebra1 (int numero, String nombre) {
	this.numero = numero;
	this.nombre = nombre;
	
	}
	
	@Override
	public void run() {
		int valor = Integer.MIN_VALUE;
		System.out.println("Hoy es" + LocalDate.now() + ". El valor es " + valor);
	}
}
