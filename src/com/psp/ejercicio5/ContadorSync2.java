package com.psp.ejercicio5;

class ContadorSync2 {

	private boolean flag = true;
	private int contador = 0;
	private static final ContadorSync2 contadorSync2 = new ContadorSync2();

	public static ContadorSync2 getInstance() {
		return contadorSync2;
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