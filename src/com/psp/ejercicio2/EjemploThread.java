package com.psp.ejercicio2;

public class EjemploThread {

    public static void main(String[] args) {

        HiloThread hiloThread = new HiloThread(1, "Thread");
        hiloThread.start();
    }
}
