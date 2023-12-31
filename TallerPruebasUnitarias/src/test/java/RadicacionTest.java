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
public class RadicacionTest {
    
    Calculadora calc;
    
    public RadicacionTest() {
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
    @DisplayName("Raiz cuadrada de un numero positivo")
    public void raizCuadradaPositiva() {
        assertEquals(4,calc.radicacion(16,2));
    }
    
    @Test
    @DisplayName("Raiz cuadrada de un numero negativo")
    public void raizCuadradaNegativa() {
        assertEquals(0,calc.radicacion(-2,2));
    }
    
    @Test
    @DisplayName("Raiz enesima de un numero")
    public void raizEnesima() {
        assertEquals(2,calc.radicacion(16,4));
    }
}
