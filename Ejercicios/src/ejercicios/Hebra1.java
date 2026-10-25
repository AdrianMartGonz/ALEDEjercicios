package ejercicios;

import java.time.LocalDate;

public class Hebra1 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hoy es" + LocalDate.now());
	}
	
}
