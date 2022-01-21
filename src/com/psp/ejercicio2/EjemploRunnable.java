package com.psp.ejercicio2;

public class EjemploRunnable {

	public static void main(String[] args) {

		HiloRunnable hiloRunnable = new HiloRunnable(1, "Runnable");

		hiloRunnable.run();
	}

}
