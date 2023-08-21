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
public class ExponenciacionTest {
    
    Calculadora calc;
    
    public ExponenciacionTest() {
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
    @DisplayName("Potencia Positiva")
    public void potenciaPositiva(){
        assertTrue(calc.exponenciacion(2,2)==4);
    }
    
    @Test
    @DisplayName("Potencia con base negativa y exponente Par")
    public void baseNegativaExpoPar(){
        assertTrue(calc.exponenciacion(-2,2)==4);
    }
    
    @Test
    @DisplayName("Potencia con base negativa y exponente Impar")
    public void baseNegativaExpoImpar(){
        assertTrue(calc.exponenciacion(-2,3)==-8);
    }
    
    @Test
    @DisplayName("Potencia de cero")
    public void potenciaCero(){
        assertAll("Agrupadas",
            () -> assertTrue(calc.exponenciacion(0,0)==1),
            () -> assertNotNull(calc.exponenciacion(0,0))
        );
    }
}
