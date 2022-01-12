package com.psp.ejercicio3;

import java.util.Date;

public class CuentaPares implements Runnable {

	int n = 0;
	int x = 1;
	int y = 0;// 100000000

	long t0 = (new Date()).getTime();

	public CuentaPares(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {

		for (int i = x; i <= y; i++) {

			if (i % 2 == 0) {
				n++;
				System.out.println(i + " es par");
			}

		}

		long t1 = (new Date()).getTime();
		long time = t1 - t0;

		System.out.println("Número de pares en el intervalo: " + x + " - " + y + " es igual a " + n + " calculado en "
				+ time + " milisegundos");

	}
	
	
	

}
