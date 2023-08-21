/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.example.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author radri
 */
public class SumaTest {
    
    Calculadora calc;
    
    public SumaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    @DisplayName("Suma Basica")
    public void sumaBasica(){
        assertTrue(0==calc.suma(0,0));
    }
    
    @Test
    @DisplayName("Suma de numeros positivos")
    public void sumaPositivos(){
        assertFalse(11!=calc.suma(8,3));
    }
    
    @Test
    @DisplayName("Suma de numeros negativos")
    public void sumaNegativos(){
        assertEquals(-6,calc.suma(-4,-2));
    }
    
}
