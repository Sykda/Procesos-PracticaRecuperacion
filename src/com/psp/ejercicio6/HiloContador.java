package com.psp.ejercicio6;

public class HiloContador implements Runnable {

	// Contador
	ContadorSync contadorSync = ContadorSync.getInstance();

	// Contenedor
	private final Contenedor contenedor;

	public HiloContador(Contenedor contenedor) {
		this.contenedor = contenedor;
	}

	public void run() {

		while (true) {

			contenedor.consume();
			contadorSync.incrementa();

			System.out.println("El numero de pares encontrados es: " + contadorSync.getCuenta());

		}
	}
}
