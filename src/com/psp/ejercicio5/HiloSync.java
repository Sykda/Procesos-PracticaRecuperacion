package com.psp.ejercicio5;

import java.util.Date;

public class HiloSync extends Thread {

	ContadorSync1 cnSync1 = new ContadorSync1();
	ContadorSync2 cnSync2 = new ContadorSync2();
	ContadorSync3 cnSync3 = new ContadorSync3();
	Contador contador= new Contador();


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
				
				contador.incrementa();
				cnSync1.incrementa();
				cnSync2.incrementa();
				cnSync3.incrementa();
				
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

	public ContadorSync1 getCnSync1() {
		return cnSync1;
	}

	public void setCnSync1(ContadorSync1 cnSync1) {
		this.cnSync1 = cnSync1;
	}

	public ContadorSync2 getCnSync2() {
		return cnSync2;
	}

	public void setCnSync2(ContadorSync2 cnSync2) {
		this.cnSync2 = cnSync2;
	}

	public ContadorSync3 getCnSync3() {
		return cnSync3;
	}

	public void setCnSync3(ContadorSync3 cnSync3) {
		this.cnSync3 = cnSync3;
	}

	public Contador getContador() {
		return contador;
	}

	public void setContador(Contador contador) {
		this.contador = contador;
	}
	

	
}
