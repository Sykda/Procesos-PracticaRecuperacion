package com.psp.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LanzaProcesoProcessBuilder {

    public static void main(String[] args) {

        try {

            ProcessBuilder cmd = new ProcessBuilder("cmd", "ver");

            BufferedReader br = new BufferedReader(new InputStreamReader(cmd.start().getInputStream()));
    
            String linea;
    
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
