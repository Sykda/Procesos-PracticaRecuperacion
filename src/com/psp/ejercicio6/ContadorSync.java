package com.psp.ejercicio6;

class ContadorSync {

	private int contador = 0;
	private static final ContadorSync contadorSync = new ContadorSync();

	public static ContadorSync getInstance() {
		return contadorSync;
	}

	public int getCuenta() {
		return contador;
	}

	public synchronized int incrementa() {

		this.contador++;

		return contador;
	}

}