/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_funcion_arreglo;

import java.awt.BorderLayout;

/**
 *
 * @author saulf
 */
public class EVA3_4_FUNCION_ARREGLO {

    public static void main(String[] args) {
        int [] arreglo = crearArreglo(10,100);
        for (int valor : arreglo)
            System.out.print("[" + valor + "]");
    }
    public static int [] crearArreglo(int tama, int rango){
        int[] arreglo = new int [tama];
        for (int i = 0; i < 10; i++) {
        arreglo[i] = (int)(Math.random() * rango);
        
            
        }
        return arreglo;
    }
}
