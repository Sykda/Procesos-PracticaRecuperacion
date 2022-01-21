package com.psp.ejercicio5;

class ContadorSync1 {

	private int contador = 0;
	private static final ContadorSync1 contadorSync1 = new ContadorSync1();

	public static ContadorSync1 getInstance() {
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