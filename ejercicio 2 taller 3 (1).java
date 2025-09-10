/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2taller3;

/**
 *
 * @author USUARIO
 */
public class calculadora {
    
    public static int sumar(int a, int b){
        return a + b;
    }
    
    public static int restar (int a, int b){
        return a - b;  
    }

    public static int multiplicar (int a, int b) {
        return a * b;
    }
    
    public static int dividir (int a, int b){
        if (b != 0){
            return a / b;
        } else {
            System.out.println("error: division entre cero.");
            return 0;
        }
    }
}
