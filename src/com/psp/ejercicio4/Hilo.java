package com.psp.ejercicio4;

public class Hilo implements Runnable {

	ContadorSync contadorSync = ContadorSync.getInstance();
	int x;
	int y;

	public Hilo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {

		for (int i = x; i <= y; i++) {

			if (i % 2 == 0) {
				contadorSync.incrementa();
				System.out.println("El hilo" + Thread.currentThread().getName() + " ha calculado que " + i + " es par");
			}

		}

	}

}
