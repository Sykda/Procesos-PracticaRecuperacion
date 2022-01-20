package com.psp.ejercicio4;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    
       
    public static void main(String[] args) throws InterruptedException {

        long t = 0;
        int i = 1;

        ExecutorService executor = Executors.newFixedThreadPool(20);

        long t0 = (new Date()).getTime();

        for (int a = 0; a < 10; a++) {

            Hilo hilo = new Hilo(i, i + 9999999);
            executor.execute(hilo);            
            i++;
            i = i + 9999999;        
            
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }
        
        long t1 = (new Date()).getTime();
        t = t1 - t0;        

        System.out.println("Número de pares en el intervalo: " + 1 + " - " + 10000000 +
                " es igual a " +  " calculado en " + t + " milisegundos");

    }

}
