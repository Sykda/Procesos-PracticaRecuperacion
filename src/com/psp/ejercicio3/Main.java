package com.psp.ejercicio3;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		CuentaPares h1 = new CuentaPares(1, 20000000);
		CuentaPares h2 = new CuentaPares(20000001, 40000000);
		CuentaPares h3 = new CuentaPares(40000001, 60000000);
		CuentaPares h4 = new CuentaPares(60000001, 80000000);
		CuentaPares h5 = new CuentaPares(80000001, 100000000);

		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
		h1.join();
		h2.join();
		h3.join();
		h4.join();
		h5.join();

		int n= h1.getN()+h2.getN()+h3.getN()+h4.getN()+h5.getN();
		
		long t= h1.getTime()+h2.getTime()+h3.getTime()+h4.getTime()+h5.getTime();
		
		 System.out.println("N�mero de pares en el intervalo: " + h1.x + " - " + h5.y +
		  " es igual a " + n + " calculado en "  +t+ " milisegundos");
		 

	}
}