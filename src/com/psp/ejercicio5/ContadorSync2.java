package com.psp.ejercicio5;

class ContadorSync2 {

	private Thread hilo;
	private int contador = 0;

	public int getCuenta() {
		return contador;
	}

	// Flag
	public int incrementa() {

		if (hilo == null) {
			this.contador++;
		}
		return contador;
	}

}