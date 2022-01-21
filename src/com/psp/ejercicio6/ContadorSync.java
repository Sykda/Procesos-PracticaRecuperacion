package com.psp.ejercicio6;

class ContadorSync {

	private boolean flag = true;
	private int contador = 0;
	private static final ContadorSync contadorSync = new ContadorSync();

	public static ContadorSync getInstance() {
		return contadorSync;
	}

	public int getCuenta() {
		return contador;
	}

	// Flag
	public int incrementa() {

		if (flag) {

			flag = false;
			this.contador++;
			flag = true;
		}
		return contador;
	}

}