package com.psp.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LanzaProcesoRuntime {

	public static void main(String[] args) throws IOException {

		Process cmd = Runtime.getRuntime().exec("cmd ver/? ");
		BufferedReader br = new BufferedReader(new InputStreamReader(cmd.getInputStream()));

		String linea;

		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
	}
}