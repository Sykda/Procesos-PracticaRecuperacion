package com.psp.ejercicio2;

public class HiloThread extends Thread {

	String name;
	Integer id;

	public HiloThread(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public void run() {

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);

	}
}
