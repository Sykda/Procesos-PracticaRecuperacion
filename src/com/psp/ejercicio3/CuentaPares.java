package com.psp.ejercicio3;

import java.util.Date;

public class CuentaPares extends Thread {

	int n = 0;
	int x;
	int y;
	long time;

	long t0 = (new Date()).getTime();

	public CuentaPares(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void run() {

		for (int i = x; i <= y; i++) {

			if (i % 2 == 0) {
				n++;
				System.out.println(i + " es par");
			}

		}

		long t1 = (new Date()).getTime();
		time = t1 - t0;

	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
}
