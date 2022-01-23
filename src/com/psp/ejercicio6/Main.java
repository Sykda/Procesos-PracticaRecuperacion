package com.psp.ejercicio6;

public class Main {

	public static void main(String[] args) throws Exception {

		Contenedor contenedor = new Contenedor();

		Thread hiloS = null;
		Thread hiloC = null;

		int i = 1;

		// Hilos 0 y 1
		for (int a = 0; a < 2; a++) {

			hiloS = new Thread(new HiloSync(contenedor, i, i + 999));
			hiloS.start();
			i++;
			i = i + 999;

		}

		// Hilos 2 y 3
		for (int a = 0; a < 2; a++) {

			hiloC = new Thread(new HiloContador(contenedor));
			hiloC.start();

		}
	}
}
