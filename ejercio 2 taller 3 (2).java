/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2taller3;
 
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("ingrese el valor de a: ");
        int a = sc.nextInt();
        
        System.out.println("ingrese el valor de b: ");
        int b = sc.nextInt();
        
        System.out.println("suma: " + calculadora.sumar(a,b));
        System.out.println("resta: " + calculadora.restar(a,b));
        System.out.println("multiplicacion: " + calculadora.multiplicar(a,b));
        System.out.println("division: " + calculadora.dividir(a,b));
        
        sc.close();
        
    }
    
    
        
    }
    

