package com.psp.ejercicio2;

public class HiloRunnable implements Runnable {

	String name;
	Integer id;

	public HiloRunnable(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);

	}

}
