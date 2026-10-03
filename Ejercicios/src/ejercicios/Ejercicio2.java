package ejercicios;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

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
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] datos = {2, 2, 3, 7, 8, 4, 5, 3, 8, 0, 2, 4, 6, 3};
		System.out.println("Hay " + numRepet(datos) + " repeticiones");
		System.out.println("El array ordenado es" + Arrays.toString(bubbleSort(datos)));
	}
	
}
