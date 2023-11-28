/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_objetos;

/**
 *
 * @author saulf
 */
public class EVA3_8_OBJETOS {

    public static void main(String[] args) {
    Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Juan";
        perso1.apellido = "Perez";
        perso1.edad = 50;
        System.out.println(perso1);
        imprimirPersona(perso1);
        
        
        
        Persona perso2 = new Persona();
        perso2.nombre = "Pedro";
        perso2.apellido = "Paramo";
        perso2.edad = 70;
        System.out.println(perso2);
        imprimirPersona(perso2);
       
    }
    public static void imprimirPersona(Persona perso){
        System.out.println("Direccion " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
}


//SON PLANTILLAS
//SON TIPOS DE DATOS
class Persona {
    String nombre;
    String apellido;
    int edad;
    
    
}
