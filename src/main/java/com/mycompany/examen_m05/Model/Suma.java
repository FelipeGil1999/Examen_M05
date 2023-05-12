/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_m05.Model;

/**
 *
 * @author Felipe
 */
public class Suma {
        public int Sumar(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }
    
        public int getNum1(int numero1, int numero2){
        int resultado = numero1;
        return resultado;
    }
    
        public int SumarValorAbsoluto(int numero1, int numero2){
        int numero1absoluto = Math.abs(numero1);
        int numero2absoluto = Math.abs(numero2);
        int resultado = numero1absoluto + numero2absoluto;

        
        return resultado;
    }
}
