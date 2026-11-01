package ejercicios;

import java.time.LocalDate;

public class Hebra1 extends Thread {
	
	@Override
	public void run() {
		int valor = Integer.MIN_VALUE;
		System.out.println("Hoy es" + LocalDate.now() + ". El valor es " + valor);
	}
}
