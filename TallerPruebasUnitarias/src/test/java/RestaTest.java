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
public class RestaTest {
    
    Calculadora calc;
    
    public RestaTest() {
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
    @DisplayName("Resta Basica")
    public void restaBasica(){
        assertAll("Pruebas Resta Basica",
            () -> assertDoesNotThrow(()->{
                calc.resta(0,0);
                }),
            () -> assertFalse(calc.resta(0,0)!=0),
            () -> assertEquals(0,calc.resta(0,0))
        );
    }
    
    @Test
    @DisplayName("Resta de numeros Negativos")
    public void restaNegativos(){
        assertTrue(calc.resta(-4,-2)==-2);
    }
    
    @Test
    @DisplayName("Resta de numeros positivos")
    public void restaPostivos(){
        assertEquals(5,calc.resta(8,3));
    }
    
}
