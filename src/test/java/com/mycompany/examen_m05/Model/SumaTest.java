/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.examen_m05.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class SumaTest {
    Suma suma;

    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        suma = new Suma();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSumar() {
        int numero1 = 3;
        int numero2 = 4;
        int esperado = 7;
        int resultado = suma.Sumar(numero1, numero2);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testGetNum1() {

        int numero1 = 3;
        int numero2 = 4;
        int esperado = 3;
        int resultado = suma.getNum1(numero1, numero2);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSumarValorAbsoluto() {
        int numero1 = -2;
        int numero2 = 5;
        int esperado = 7;
        int resultado = suma.SumarValorAbsoluto(numero1, numero2);
        assertEquals(esperado, resultado);

    }
    
}
