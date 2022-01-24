package com.psp.ejercicio6;

public class HiloSync implements Runnable {

	// Contenedor
	private final Contenedor contenedor;

	int x;
	int y;

	public HiloSync(Contenedor contenedor, int x, int y) {
		this.contenedor = contenedor;
		this.x = x;
		this.y = y;
	}

	public void run() {

		for (int i = x; i <= y; i++) {

			if (i % 2 == 0) {

				contenedor.produce();
				System.out.println(
						"El hilo: " + Thread.currentThread().getName() + " ha calculado que " + i + " es par.");

			}
		}
	}
}
