package com.psp.ejercicio4;

class ContadorSync {

	private int contador = 0;
	private static final ContadorSync contadorSync1 = new ContadorSync();

	public static ContadorSync getInstance() {
		return contadorSync1;
	}

	public int getCuenta() {
		return contador;
	}

	// Synchronized
	public synchronized int incrementa() {
		this.contador++;
		return contador;
	}

}