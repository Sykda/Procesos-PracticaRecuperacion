package com.psp.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		final List<Integer> listaTareas = new ArrayList<Integer>();
		ContadorSync contadorSync = ContadorSync.getInstance();
		HiloSync hiloS = null;
		HiloContador hiloC = null;

		int i = 1;
		for (int a = 0; a < 2; a++) {

			hiloS = new HiloSync(i, i + 99, listaTareas);
			hiloS.start();
			i++;
			i = i + 99;

		}

		for (int a = 0; a < 2; a++) {

			hiloC = new HiloContador(listaTareas);
			hiloC.start();

		}

		hiloS.join();
		hiloC.join();

		System.out.println(contadorSync.getCuenta());

	}
}
