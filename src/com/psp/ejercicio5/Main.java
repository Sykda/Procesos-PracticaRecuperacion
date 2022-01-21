package com.psp.ejercicio5;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		ContadorSync1 contadorSync1 = ContadorSync1.getInstance();
		ContadorSync2 contadorSync2 = ContadorSync2.getInstance();
		ContadorSync3 contadorSync3 = ContadorSync3.getInstance();

		HiloSync h1 = new HiloSync(1, 20000000);
		HiloSync h2 = new HiloSync(20000001, 40000000);
		HiloSync h3 = new HiloSync(40000001, 60000000);
		HiloSync h4 = new HiloSync(60000001, 80000000);
		HiloSync h5 = new HiloSync(80000001, 100000000);

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

		System.out.println("La cuenta del contadorSync1 es: " + contadorSync1.getCuenta());
		System.out.println("La cuenta del contadorSync2 es: " + contadorSync2.getCuenta());
		System.out.println("La cuenta del contadorSync2 es: " + contadorSync3.getCuenta());

	}

}
