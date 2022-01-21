package com.psp.ejercicio6;

import java.util.List;

public class HiloSync extends Thread {

	private final List<Integer> listaTareas;

	int x;
	int y;

	public HiloSync(int x, int y, List<Integer> listaCompartida) {
		this.x = x;
		this.y = y;
		this.listaTareas = listaCompartida;
	}

	public synchronized void run() {

		for (int i = x; i <= y; i++) {

			if (i % 2 == 0) {

				listaTareas.add(1);
				System.out.println(
						"El hilo: " + Thread.currentThread().getName() + " ha calculado que " + i + " es par.");
				notify();
			}
		}
	}
}
