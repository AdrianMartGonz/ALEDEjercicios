package ejercicios;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio2 {
	
	public static int numRepet(int[] numeros){
		Set<Integer> repetidos = new HashSet<>();
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i+1; j < numeros.length; j++) {
				if (numeros[i] == numeros[j]) {
					repetidos.add(numeros[i]);
					contador++;
					break;
				}
			}
		}
		return contador;
	}

	
	public static void main(String[] args) {
		int[] datos = {2, 2, 3, 7, 8, 4, 5, 3, 8, 0, 2, 4, 6, 3};
		System.out.println("Hay " + numRepet(datos) + " repeticiones");
	}
	
}
