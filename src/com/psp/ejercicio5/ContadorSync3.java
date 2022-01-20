package com.psp.ejercicio5;

import java.util.concurrent.Semaphore;

class ContadorSync3 {

	private int contador = 0;
	final Semaphore semp = new Semaphore(1);

	public int getCuenta() {
		return contador;
	}

	// Semaphore
	public int incrementa() {

		try {
			semp.acquire();
			this.contador++;
			semp.release();

		} catch (InterruptedException e) {
			System.out.println("Ha habido un error");
		}

		return contador;
	}

}