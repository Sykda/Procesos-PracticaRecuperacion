package com.psp.ejercicio5;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        HiloSync h1 = new HiloSync(1, 20000);
        HiloSync h2 = new HiloSync(20001, 40000);
        HiloSync h3 = new HiloSync(40001, 60000);
        HiloSync h4 = new HiloSync(60001, 80000);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        h1.join();
        h2.join();
        h3.join();
        h4.join();

        int c1 = h1.getContador().getCuenta();

        int e1 = h2.getContador().getCuenta();

        int d1 = h3.getContador().getCuenta();

        int f1 = h4.getContador().getCuenta();

        System.out.println(" Hilo 1: " + c1 + " Hilo 2: " + e1 + " Hilo 3: " + d1 + " Hilo 4: " + f1);

        /*
         * int c1 = h1.getContador().getCuenta();
         * int c2 = h1.getCnSync2().getCuenta();
         * int c3 = h1.getCnSync3().getCuenta();
         * 
         * int e1 = h2.getContador().getCuenta();
         * int e2 = h2.getCnSync2().getCuenta();
         * int e3 = h2.getCnSync3().getCuenta();
         * 
         * int d1 = h3.getContador().getCuenta();
         * int d2 = h3.getCnSync2().getCuenta();
         * int d3 = h3.getCnSync3().getCuenta();
         * 
         * int f1 = h4.getContador().getCuenta();
         * int f2 = h4.getCnSync2().getCuenta();
         * int f3 = h4.getCnSync3().getCuenta();
         * 
         * 
         * // long t= h1.getTime()+h2.getTime()+h3.getTime()+h4.getTime()+h5.getTime();
         * 
         * System.out.println("Hilo 1 = Contador 1: " + c1 + " Contador 2: " + c2 +
         * " Contador 3: " + c3);
         * System.out.println("Hilo 2 = Contador 1: " + e1 + " Contador 2: " + e2 +
         * " Contador 3: " + e3);
         * System.out.println("Hilo 3 = Contador 1: " + d1 + " Contador 2: " + d2 +
         * " Contador 3: " + d3);
         * System.out.println("Hilo 4 = Contador 1: " + f1 + " Contador 2: " + f2 +
         * " Contador 3: " + f3);
         */
    }

}
