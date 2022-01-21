package com.psp.ejercicio6;

import java.util.List;

public class HiloContador extends Thread {

	ContadorSync contadorSync = ContadorSync.getInstance();

	private final List<Integer> listaTareas;

	public HiloContador(List<Integer> listaCompartida) {
		this.listaTareas = listaCompartida;
	}

	public synchronized void run() {

		while (true) {
			if (listaTareas.isEmpty()) {
				try {

					wait();

				} catch (InterruptedException e) {
					System.out.println("Hilo interrumpido.");
				}
			} else {

				for (int i : listaTareas) {

					contadorSync.incrementa();
					listaTareas.remove(i);
				}
			}
		}
	}
}
