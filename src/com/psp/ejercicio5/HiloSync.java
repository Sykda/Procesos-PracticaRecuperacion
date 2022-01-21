package com.psp.ejercicio5;

import java.util.Date;

public class HiloSync extends Thread {

	ContadorSync1 contadorSync1 = ContadorSync1.getInstance();
	ContadorSync2 contadorSync2 = ContadorSync2.getInstance();
	ContadorSync3 contadorSync3 = ContadorSync3.getInstance();

	int x;
	int y;
	long time;

	long t0 = (new Date()).getTime();

	public HiloSync(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void run() {

		for (int i = x; i <= y; i++) {

			if (i % 2 == 0) {

				contadorSync1.incrementa();
				contadorSync2.incrementa();
				contadorSync3.incrementa();

				System.out.println(i + " es par");
			}

		}

		long t1 = (new Date()).getTime();
		time = t1 - t0;

	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

}
