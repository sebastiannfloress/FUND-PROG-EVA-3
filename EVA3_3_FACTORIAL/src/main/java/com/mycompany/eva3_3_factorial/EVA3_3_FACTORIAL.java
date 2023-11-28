/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_factorial;

/**
 *
 * @author saulf
 */
public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        // llamada a funcion:
        System.out.println("El factorial de 5 = " + calcularFactorial(5));
        System.out.println("5 elevado a la 3 = " +calcularPotencia(5, 3));
        
    }
    public static int calcularFactorial(int num){
        //factorial de 5: 1 x 2 x 3 x 4 x 5 = 120
        //usar ciclos 
        //regresar el valor calculado 
        int resu = 1;
      for (int i = 1; i <= num; i++) {
          resu *= i; // resu = resu * i;
          
            
        }
      return resu;
        
    }
    // crear funcion que calcule la potencia de un numero entero.
    public static int calcularPotencia(int base, int exp){
        int resultado = 1;
        for (int i = 1; i <= exp; i++) {
            resultado *= base;
            
        }
        return resultado;
        
    }
}

